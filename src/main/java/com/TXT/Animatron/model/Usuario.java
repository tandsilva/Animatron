package com.TXT.Animatron.model;

import java.util.List;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String humorAtual; // tristeza, alegria, raiva...
    private List<Agenda> agendas; // tarefas ou eventos

    public Usuario() {}

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String saudacao() {
        switch (humorAtual) {
            case "tristeza": return "Oi, tudo bem? Vamos devagar hoje.";
            case "alegria": return "Que bom te ver animado!";
            case "raiva": return "Vamos dar um tempo e respirar?";
            default: return "Olá! Pronto para o dia?";
        }
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHumorAtual() {
        return humorAtual;
    }

    public void setHumorAtual(String humorAtual) {
        this.humorAtual = humorAtual;
    }

    public List<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(List<Agenda> agendas) {
        this.agendas = agendas;
    }
}
