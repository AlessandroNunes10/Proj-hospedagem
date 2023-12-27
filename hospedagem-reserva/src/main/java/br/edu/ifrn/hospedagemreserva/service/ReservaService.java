package br.edu.ifrn.hospedagemreserva.service;

import br.edu.ifrn.hospedagemreserva.domain.reserva.Reserva;

import java.util.List;

public interface ReservaService {
    List<Reserva> getAllReservas();
    Reserva getReservaById(Long id);
    Reserva saveReserva(Reserva reserva);
    Reserva updateReserva(Long id, Reserva reserva);
    void deleteReserva(Long id);
}