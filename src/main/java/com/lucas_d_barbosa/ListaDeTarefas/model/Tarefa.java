package com.lucas_d_barbosa.ListaDeTarefas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;


import java.time.LocalDateTime;

@Entity(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String tarefa;
    @Column
    private String descricao;
    @Column(name = "data_criacao")
    private LocalDateTime data_criacao;
    @Column(name = "data_termino")
    private LocalDateTime data_termino;

    public Tarefa() {}

    public Tarefa(String tarefa, String descricao, LocalDateTime data_criacao, LocalDateTime data_termino) {
        this.tarefa = tarefa;
        this.descricao = descricao;
        this.data_criacao = data_criacao;
        this.data_termino = data_termino;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", tarefa='" + tarefa + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data_criacao=" + data_criacao +
                ", data_termino=" + data_termino +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }

    public LocalDateTime getData_termino() {
        return data_termino;
    }

    public void setData_termino(LocalDateTime data_termino) {
        this.data_termino = data_termino;
    }
}
