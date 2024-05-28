package com.avaliacao.demo.repository;

import com.avaliacao.demo.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}