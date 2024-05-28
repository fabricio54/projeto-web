package com.avaliacao.demo.controller;

import com.avaliacao.demo.model.Componente;
import com.avaliacao.demo.service.ComponenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/componentes")
public class ComponenteController {
    @Autowired
    private ComponenteService componenteService;

    @GetMapping
    public List<Componente> getAllComponentes() {
        return componenteService.getAllComponentes();
    }

    @PostMapping
    public Componente createComponente(@RequestBody Componente componente) {
        return componenteService.saveComponente(componente);
    }

    @DeleteMapping("/{id}")
    public void deleteComponente(@PathVariable Integer id) {
        componenteService.deleteComponente(id);
    }
}
