package br.edu.ifrn.hospedagemreserva.service;

import br.edu.ifrn.hospedagemreserva.domain.hospede.Hospede;

import java.util.List;

public interface HospedeService {
    List<Hospede> getAllHospedes();
    Hospede getHospedeById(Long id);
    Hospede saveHospede(Hospede hospede);
    Hospede updateHospede(Long id, Hospede hospede);
    void deleteHospede(Long id);
}