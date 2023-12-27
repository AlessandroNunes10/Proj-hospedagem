package br.edu.ifrn.hospedagemreserva.controller;

import br.edu.ifrn.hospedagemreserva.domain.hospede.Hospede;
import br.edu.ifrn.hospedagemreserva.service.HospedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospedes")
public class HospedeController {

    @Autowired
    private HospedeService hospedeService;

    @GetMapping
    public List<Hospede> getAllHospedes() {
        return hospedeService.getAllHospedes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospede> getHospedeById(@PathVariable Long id) {
        Hospede hospede = hospedeService.getHospedeById(id);
        return ResponseEntity.ok(hospede);
    }

    @PostMapping
    public ResponseEntity<Hospede> createHospede(@RequestBody Hospede hospede) {
        Hospede createdHospede = hospedeService.saveHospede(hospede);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHospede);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hospede> updateHospede(@PathVariable Long id, @RequestBody Hospede hospede) {
        Hospede updatedHospede = hospedeService.updateHospede(id, hospede);
        return ResponseEntity.ok(updatedHospede);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHospede(@PathVariable Long id) {
        hospedeService.deleteHospede(id);
        return ResponseEntity.noContent().build();
    }
}