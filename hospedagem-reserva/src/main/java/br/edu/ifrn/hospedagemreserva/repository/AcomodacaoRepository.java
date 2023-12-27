package br.edu.ifrn.hospedagemreserva.repository;

import br.edu.ifrn.hospedagemreserva.domain.acomodacao.Acomodacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcomodacaoRepository extends JpaRepository<Acomodacao, Long> {
    
}