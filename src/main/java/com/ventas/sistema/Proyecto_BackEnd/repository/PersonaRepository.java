package com.ventas.sistema.Proyecto_BackEnd.repository;

import com.ventas.sistema.Proyecto_BackEnd.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
}

