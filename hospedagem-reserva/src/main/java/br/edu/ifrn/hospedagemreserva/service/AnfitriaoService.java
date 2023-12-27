package br.edu.ifrn.hospedagemreserva.service;

import br.edu.ifrn.hospedagemreserva.domain.anfitriao.Anfitriao;

import java.util.List;

public interface AnfitriaoService {
    List<Anfitriao> getAllAnfitrioes();
    Anfitriao getAnfitriaoById(Long id);
    Anfitriao saveAnfitriao(Anfitriao anfitriao);
    Anfitriao updateAnfitriao(Long id, Anfitriao anfitriao);
    void deleteAnfitriao(Long id);
}