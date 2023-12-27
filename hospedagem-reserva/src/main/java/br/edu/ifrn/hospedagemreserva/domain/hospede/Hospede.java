package br.edu.ifrn.hospedagemreserva.domain.hospede;

import br.edu.ifrn.hospedagemreserva.domain.reserva.Reserva;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "hospede")
@Table(name = "hospede")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Hospede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @Column(name = "data_registro")
    private LocalDate dataRegistro;

    @OneToMany(mappedBy = "hospede")
    private List<Reserva> reservas;

    // getters and setters
}