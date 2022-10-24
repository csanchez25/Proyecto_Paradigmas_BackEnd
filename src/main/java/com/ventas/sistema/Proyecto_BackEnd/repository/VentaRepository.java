package com.ventas.sistema.Proyecto_BackEnd.repository;

import com.ventas.sistema.Proyecto_BackEnd.entity.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Long> {
}
