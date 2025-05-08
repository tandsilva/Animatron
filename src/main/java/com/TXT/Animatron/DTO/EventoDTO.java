package com.TXT.Animatron.DTO;


import java.time.LocalDateTime;

public class EventoDTO {

    private String titulo;
    private String local;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private String Observacoes;
    public EventoDTO() {}

    public EventoDTO(String titulo, String local, LocalDateTime inicio, LocalDateTime fim,String Observacoes) {
        this.titulo = titulo;
        this.local = local;
        this.inicio = inicio;
        this.fim = fim;
        this.Observacoes = Observacoes;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String observacoes) {
        Observacoes = observacoes;
    }

    // Getters e Setters
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
}
