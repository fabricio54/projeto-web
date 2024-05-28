package com.avaliacao.demo.model;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    // Getters and Setters
}
