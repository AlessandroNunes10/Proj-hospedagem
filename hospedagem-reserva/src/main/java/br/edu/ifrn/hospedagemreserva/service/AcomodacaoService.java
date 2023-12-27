package br.edu.ifrn.hospedagemreserva.service;

import br.edu.ifrn.hospedagemreserva.domain.acomodacao.Acomodacao;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AcomodacaoService {
    List<Acomodacao> getAllAcomodacoes();
    Acomodacao getAcomodacaoById(Long id);
    Acomodacao saveAcomodacao(Acomodacao acomodacao);
    Acomodacao updateAcomodacao(Long id, Acomodacao acomodacao);
    void deleteAcomodacao(Long id);
}