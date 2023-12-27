package br.edu.ifrn.hospedagemreserva.domain.acomodacao;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.edu.ifrn.hospedagemreserva.domain.anfitriao.Anfitriao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    @Column(name = "nome")
    private String nome;
    @Column(name = "localizacao")
    private String localizacao;
    @Column(name = "numero_registro")
    private int numero_registro;
    @Column(name = "quartos_disponiveis")
    private int quartos_disponiveis;
    @ManyToOne
    @JoinColumn(name = "anfitriao_id")
    @JsonBackReference
    private Anfitriao anfitriao;
}