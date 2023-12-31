package br.edu.ifrn.hospedagemreserva.domain.anfitriao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.edu.ifrn.hospedagemreserva.domain.acomodacao.Acomodacao;

@Entity(name = "anfitriao")    //JPQL
@Table(name = "anfitriao")     //SQL
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Anfitriao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nome do anfitrião é obrigatório")
    @Column(name = "nome")
    private String nome;
    @Column(name = "nacionalidade")
    private String nacionalidade;
    @OneToMany(mappedBy = "anfitriao", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Acomodacao> acomodacoes;
}