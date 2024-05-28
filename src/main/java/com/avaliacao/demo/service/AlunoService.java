package com.avaliacao.demo.service;

import com.avaliacao.demo.model.Aluno;
import com.avaliacao.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deleteAluno(Integer id) {
        alunoRepository.deleteById(id);
    }
}
