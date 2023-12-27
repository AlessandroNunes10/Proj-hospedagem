package br.edu.ifrn.hospedagemreserva.repository;

import br.edu.ifrn.hospedagemreserva.domain.hospede.Hospede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Long> {
    
}