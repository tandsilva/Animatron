package com.TXT.Animatron.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.LocalDateTime;

@Node
public class Evento {

    @Id
    private Long id;
    private String titulo;
    private String local;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private String observacoes;

    // Construtor
    public Evento(Long id, String titulo, String local, LocalDateTime inicio, LocalDateTime fim, String observacoes) {
        this.id = id;
        this.titulo = titulo;
        this.local = local;
        this.inicio = inicio;
        this.fim = fim;
        this.observacoes = observacoes;
    }

    // Método para verificar se o evento está acontecendo agora
    public boolean estaAcontecendoAgora() {
        LocalDateTime agora = LocalDateTime.now();
        return (agora.isAfter(inicio) && agora.isBefore(fim));
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
