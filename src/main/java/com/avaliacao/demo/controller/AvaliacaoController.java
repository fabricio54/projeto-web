package com.avaliacao.demo.controller;

import com.avaliacao.demo.model.Avaliacao;
import com.avaliacao.demo.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {
    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping
    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacaoService.getAllAvaliacoes();
    }

    @PostMapping
    public Avaliacao createAvaliacao(@RequestBody Avaliacao avaliacao) {
        return avaliacaoService.saveAvaliacao(avaliacao);
    }

    @DeleteMapping("/{id}")
    public void deleteAvaliacao(@PathVariable Integer id) {
        avaliacaoService.deleteAvaliacao(id);
    }
}
