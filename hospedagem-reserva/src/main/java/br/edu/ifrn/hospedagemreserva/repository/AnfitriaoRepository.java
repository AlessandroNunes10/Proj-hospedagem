package br.edu.ifrn.hospedagemreserva.repository;

import br.edu.ifrn.hospedagemreserva.domain.anfitriao.Anfitriao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnfitriaoRepository extends JpaRepository<Anfitriao, Long> {
    
}