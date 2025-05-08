package com.TXT.Animatron.service;



import com.TXT.Animatron.model.Evento;

import java.util.ArrayList;
import java.util.List;

public class AgendaService {

    private List<Evento> eventos;

    public AgendaService() {
        this.eventos = new ArrayList<>();
    }

    // Adicionar um evento à agenda
    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Remover um evento pela ID
    public boolean removerEvento(int idEvento) {
        return eventos.removeIf(evento -> evento.getId() == idEvento);
    }

    // Listar todos os eventos da agenda
    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos);
    }

    // Buscar um evento por ID
    public Evento buscarEventoPorId(int idEvento) {
        for (Evento evento : eventos) {
            if (evento.getId() == idEvento) {
                return evento;
            }
        }
        return null; // Evento não encontrado
    }
}
