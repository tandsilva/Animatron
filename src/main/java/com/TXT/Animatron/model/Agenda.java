package com.TXT.Animatron.model;

import java.time.LocalDate;
import java.util.List;

public class Agenda {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDate data;
    private String emocao; // alegria, tristeza, raiva...
    private boolean concluida;
    private List<String> respostasGeradas; // respostas da IA baseadas na emoção


    // Construtores
    public Agenda() {}


    public Agenda(Long id, String titulo, String descricao, LocalDate data, boolean concluida, String emocao, List<String> respostasGeradas) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.concluida = concluida;
        this.emocao = emocao;
        this.respostasGeradas = respostasGeradas;
    }


    public Agenda(String titulo, String descricao, LocalDate data, String emocao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.emocao = emocao;
        this.concluida = false;
    }

    // Métodos
    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public String gerarResposta() {
        switch (emocao) {
            case "tristeza":
                return "Não desanime! Vamos fazer isso juntos.";
            case "alegria":
                return "Ótimo! Vamos aproveitar esse bom humor.";
            case "raiva":
                return "Respira... depois voltamos a isso.";
            default:
                return "Vamos seguir em frente com calma.";
        }
    }
}
