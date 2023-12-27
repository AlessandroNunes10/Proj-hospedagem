package br.edu.ifrn.hospedagemreserva.controller;

import br.edu.ifrn.hospedagemreserva.domain.acomodacao.Acomodacao;
import br.edu.ifrn.hospedagemreserva.controller.AcomodacaoController;
import br.edu.ifrn.hospedagemreserva.service.AcomodacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/api/acomodacoes")
public class AcomodacaoController {

    @Autowired
    private AcomodacaoService acomodacaoService;

    @GetMapping
    public List<Acomodacao> getAllAcomodacoes() {
        return acomodacaoService.getAllAcomodacoes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Acomodacao> getAcomodacaoById(@PathVariable Long id) {
        Acomodacao acomodacao = acomodacaoService.getAcomodacaoById(id);
        return ResponseEntity.ok(acomodacao);
    }

    @PostMapping
    public ResponseEntity<Acomodacao> createAcomodacao(@RequestBody Acomodacao acomodacao) {
        Acomodacao createdAcomodacao = acomodacaoService.saveAcomodacao(acomodacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAcomodacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Acomodacao> updateAcomodacao(@PathVariable Long id, @RequestBody Acomodacao acomodacao) {
        Acomodacao updatedAcomodacao = acomodacaoService.updateAcomodacao(id, acomodacao);
        return ResponseEntity.ok(updatedAcomodacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAcomodacao(@PathVariable Long id) {
        acomodacaoService.deleteAcomodacao(id);
        return ResponseEntity.noContent().build();
    }
}