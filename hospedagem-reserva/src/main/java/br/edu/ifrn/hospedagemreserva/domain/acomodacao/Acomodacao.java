package br.edu.ifrn.hospedagemreserva.domain.acomodacao;

import br.edu.ifrn.hospedagemreserva.domain.anfitriao.Anfitriao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "acomodacao")
@Table(name = "acomodacao")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Acomodacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome da acomodação obrigatório")
    private String nome;

    @NotNull
    private String localizacao;

    @Column(name = "numero_registro")
    private String numeroRegistro;
    
    @Column(name = "quartos_disponiveis")
    private int quartosDisponiveis;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "anfitriao_id") // Chave estrangeira
    private Anfitriao anfitriao;
}