package com.TXT.Animatron.DTO;

import java.time.LocalDate;

public class AgendaDTO {

    private String titulo;
    private String descricao;
    private LocalDate data;
    private String emocao;

    public AgendaDTO() {}

    public AgendaDTO(String titulo, String descricao, LocalDate data, String emocao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.emocao = emocao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEmocao() {
        return emocao;
    }

    public void setEmocao(String emocao) {
        this.emocao = emocao;
    }
}
