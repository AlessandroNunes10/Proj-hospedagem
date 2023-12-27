package br.edu.ifrn.hospedagemreserva.repository;

import br.edu.ifrn.hospedagemreserva.domain.reserva.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
}