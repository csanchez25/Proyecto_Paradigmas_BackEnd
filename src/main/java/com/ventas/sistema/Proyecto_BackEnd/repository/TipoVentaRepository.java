package com.ventas.sistema.Proyecto_BackEnd.repository;

import com.ventas.sistema.Proyecto_BackEnd.entity.Tipo_Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoVentaRepository extends CrudRepository<Tipo_Venta, Long> {
}

