package com.avaliacao.demo.controller;

import com.avaliacao.demo.model.Aluno;
import com.avaliacao.demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.saveAluno(aluno);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Integer id) {
        alunoService.deleteAluno(id);
    }
}
