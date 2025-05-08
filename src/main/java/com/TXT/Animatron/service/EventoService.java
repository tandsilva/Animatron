package com.TXT.Animatron.service;

import com.TXT.Animatron.model.Evento;
import com.TXT.Animatron.repository.EventoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public Evento salvar(Evento evento) {
        return repository.save(evento);
    }

    public List<Evento> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
