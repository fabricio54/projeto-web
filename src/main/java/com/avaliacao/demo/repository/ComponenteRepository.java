package com.avaliacao.demo.repository;

import com.avaliacao.demo.model.Componente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponenteRepository extends JpaRepository<Componente, Integer> {
}
