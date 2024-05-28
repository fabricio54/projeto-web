package com.avaliacao.demo.model;

import javax.persistence.*;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String periodo;

    @ManyToOne
    @JoinColumn(name = "componente_id")
    private Componente componente;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private String categoriaAvaliacao;
    private Integer conceitoProfessor;
    private Integer conceitoRecursoDidatico;
    private Integer conceitoRelevanciaDisciplina;

    // Getters and Setters
}
