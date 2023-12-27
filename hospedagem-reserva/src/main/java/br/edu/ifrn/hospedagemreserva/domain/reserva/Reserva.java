package br.edu.ifrn.hospedagemreserva.domain.reserva;

import br.edu.ifrn.hospedagemreserva.domain.acomodacao.Acomodacao;
import br.edu.ifrn.hospedagemreserva.domain.hospede.Hospede;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "reserva")
@Table(name = "reserva")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "acomodacao_id")
    private Acomodacao acomodacao;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "hospede_id")
    private Hospede hospede;
}