package com.TXT.Animatron.controller;

import com.TXT.Animatron.DTO.EventoDTO;
import com.TXT.Animatron.model.Evento;
import com.TXT.Animatron.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping("/evento")
    public Evento adicionarEvento(@RequestBody EventoDTO eventoDTO) {
        Evento evento = new Evento(
                eventoDTO.getTitulo(),
                eventoDTO.getLocal(),
                eventoDTO.getInicio(),
                eventoDTO.getFim(),
                eventoDTO.getObservacoes()
        );
        eventoRepository.save(evento); // Salva o evento no banco
        return evento; // Retorna o evento com o id gerado
    }
}
