package com.avaliacao.demo.model;

import javax.persistence.*;

@Entity
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sigla;
    private String matrizCurricular;
    private String cargaHoraria;

    // Getters and Setters
}