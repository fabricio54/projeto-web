package com.avaliacao.demo.service;

import com.avaliacao.demo.model.Componente;
import com.avaliacao.demo.repository.ComponenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponenteService {
    @Autowired
    private ComponenteRepository componenteRepository;

    public List<Componente> getAllComponentes() {
        return componenteRepository.findAll();
    }

    public Componente saveComponente(Componente componente) {
        return componenteRepository.save(componente);
    }

    public void deleteComponente(Integer id) {
        componenteRepository.deleteById(id);
    }
}
