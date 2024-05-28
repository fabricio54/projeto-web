package com.avaliacao.demo.service;

import com.avaliacao.demo.model.Avaliacao;
import com.avaliacao.demo.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacaoRepository.findAll();
    }

    public Avaliacao saveAvaliacao(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public void deleteAvaliacao(Integer id) {
        avaliacaoRepository.deleteById(id);
    }
}
