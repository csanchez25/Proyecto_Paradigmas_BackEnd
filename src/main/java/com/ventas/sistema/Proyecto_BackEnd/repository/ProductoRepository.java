package com.ventas.sistema.Proyecto_BackEnd.repository;

import com.ventas.sistema.Proyecto_BackEnd.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
}