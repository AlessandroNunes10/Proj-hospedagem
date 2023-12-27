package br.edu.ifrn.hospedagemreserva.service;

import br.edu.ifrn.hospedagemreserva.domain.hospede.Hospede;
import br.edu.ifrn.hospedagemreserva.domain.reserva.Reserva;
import br.edu.ifrn.hospedagemreserva.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva getReservaById(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva saveReserva(Reserva reserva) {
        // Verificar se o hóspede atingiu o limite máximo de reservas
        if (hasReachedReservationLimit(reserva.getHospede())) {
            throw new RuntimeException("O hóspede atingiu o limite máximo de reservas permitidas.");
        }

        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva updateReserva(Long id, Reserva reserva) {
        // Implementar a lógica de atualização se necessário
        // ...

        return reservaRepository.save(reserva);
    }

    @Override
    public void deleteReserva(Long id) {
        reservaRepository.deleteById(id);
    }

    // Método para verificar se o hóspede atingiu o limite máximo de reservas
    private boolean hasReachedReservationLimit(Hospede hospede) {
        // Suponha que o limite máximo seja 3 reservas, ajuste conforme necessário
        int limiteMaximoReservas = 3;

        // Obter a lista de reservas atuais do hóspede
        List<Reserva> reservasDoHospede = hospede.getReservas();

        // Verificar se o número de reservas atuais ultrapassa o limite máximo
        return reservasDoHospede.size() >= limiteMaximoReservas;
    }
}