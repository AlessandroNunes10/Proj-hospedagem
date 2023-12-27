package br.edu.ifrn.hospedagemreserva.domain.anfitriao;

import br.edu.ifrn.hospedagemreserva.domain.acomodacao.Acomodacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "anfitriao")
@Table(name = "anfitriao")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Anfitriao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String nacionalidade;

    @OneToMany(mappedBy = "anfitriao")
    private List<Acomodacao> acomodacoes;

}