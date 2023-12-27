package br.edu.ifrn.hospedagemreserva.domain.reserva;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.edu.ifrn.hospedagemreserva.domain.acomodacao.Acomodacao;
import br.edu.ifrn.hospedagemreserva.domain.hospede.Hospede;
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
    private LocalDateTime data_inicio;
    @Column(name = "data_fim")
    private LocalDateTime data_fim;
    @ManyToOne
    @JoinColumn(name = "acomodacao_id")
    private Acomodacao acomodacao;
    @ManyToOne
    @JoinColumn(name = "hospede_id")
    @JsonBackReference
    private Hospede hospede;
}