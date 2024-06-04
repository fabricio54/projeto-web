package com.avaliacao.demo.controller;

import com.avaliacao.demo.model.Endereco;
import com.avaliacao.demo.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> getAllEnderecos() {
        return enderecoService.getAllEnderecos();
    }

    @GetMapping("/{id}")
    public Endereco getEnderecoById(@PathVariable Integer id) {
        return enderecoService.getEnderecoById(id);
    }

    @PostMapping
    public Endereco createEndereco(@RequestBody Endereco endereco) {
        return enderecoService.saveEndereco(endereco);
    }

    @PutMapping("/{id}")
    public Endereco updateEndereco(@PathVariable Integer id, @RequestBody Endereco enderecoDetails) {
        return enderecoService.updateEndereco(id, enderecoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEndereco(@PathVariable Integer id) {
        enderecoService.deleteEndereco(id);
    }
}

