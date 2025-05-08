package com.TXT.Animatron.controller;
import com.TXT.Animatron.model.Evento;
import com.TXT.Animatron.service.AgendaService;

import java.util.List;

public class AgendaController {

    private AgendaService agendaService;  // A classe que irá tratar a lógica de negócios

    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    // Adicionar um novo evento à agenda
    public void adicionarEvento(Evento evento) {
        agendaService.adicionarEvento(evento);
        System.out.println("Evento adicionado com sucesso.");
    }

    // Remover um evento da agenda
    public void removerEvento(int idEvento) {
        boolean sucesso = agendaService.removerEvento(idEvento);
        if (sucesso) {
            System.out.println("Evento removido com sucesso.");
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    // Listar todos os eventos da agenda
    public void listarEventos() {
        List<Evento> eventos = agendaService.listarEventos();
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento encontrado.");
        } else {
            for (Evento evento : eventos) {
                System.out.println(evento);
            }
        }
    }

    // Buscar um evento pelo ID
    public void buscarEventoPorId(int idEvento) {
        Evento evento = agendaService.buscarEventoPorId(idEvento);
        if (evento != null) {
            System.out.println("Evento encontrado: " + evento);
        } else {
            System.out.println("Evento não encontrado.");
        }
    }
}
