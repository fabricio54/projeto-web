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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getCategoriaAvaliacao() {
        return categoriaAvaliacao;
    }

    public void setCategoriaAvaliacao(String categoriaAvaliacao) {
        this.categoriaAvaliacao = categoriaAvaliacao;
    }

    public Integer getConceitoProfessor() {
        return conceitoProfessor;
    }

    public void setConceitoProfessor(Integer conceitoProfessor) {
        this.conceitoProfessor = conceitoProfessor;
    }

    public Integer getConceitoRecursoDidatico() {
        return conceitoRecursoDidatico;
    }

    public void setConceitoRecursoDidatico(Integer conceitoRecursoDidatico) {
        this.conceitoRecursoDidatico = conceitoRecursoDidatico;
    }

    public Integer getConceitoRelevanciaDisciplina() {
        return conceitoRelevanciaDisciplina;
    }

    public void setConceitoRelevanciaDisciplina(Integer conceitoRelevanciaDisciplina) {
        this.conceitoRelevanciaDisciplina = conceitoRelevanciaDisciplina;
    }
}

