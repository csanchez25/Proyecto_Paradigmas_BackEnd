package com.ventas.sistema.Proyecto_BackEnd.repository;

import com.ventas.sistema.Proyecto_BackEnd.entity.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
