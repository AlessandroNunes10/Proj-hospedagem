package br.edu.ifrn.hospedagemreserva.controller;

import br.edu.ifrn.hospedagemreserva.domain.anfitriao.Anfitriao;
import br.edu.ifrn.hospedagemreserva.service.AnfitriaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anfitrioes")
public class AnfitriaoController {

    @Autowired
    private AnfitriaoService anfitriaoService;

    @GetMapping
    public List<Anfitriao> getAllAnfitrioes() {
        return anfitriaoService.getAllAnfitrioes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anfitriao> getAnfitriaoById(@PathVariable Long id) {
        Anfitriao anfitriao = anfitriaoService.getAnfitriaoById(id);
        return ResponseEntity.ok(anfitriao);
    }

    @PostMapping
    public ResponseEntity<Anfitriao> createAnfitriao(@RequestBody Anfitriao anfitriao) {
        Anfitriao createdAnfitriao = anfitriaoService.saveAnfitriao(anfitriao);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAnfitriao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anfitriao> updateAnfitriao(@PathVariable Long id, @RequestBody Anfitriao anfitriao) {
        Anfitriao updatedAnfitriao = anfitriaoService.updateAnfitriao(id, anfitriao);
        return ResponseEntity.ok(updatedAnfitriao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnfitriao(@PathVariable Long id) {
        anfitriaoService.deleteAnfitriao(id);
        return ResponseEntity.noContent().build();
    }
}