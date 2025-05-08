package com.TXT.Animatron.repository;

import com.TXT.Animatron.model.Evento;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface EventoRepository extends Neo4jRepository<Evento, Long> {
}
