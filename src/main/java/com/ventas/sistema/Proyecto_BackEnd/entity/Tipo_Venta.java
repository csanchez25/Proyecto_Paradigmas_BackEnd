package com.ventas.sistema.Proyecto_BackEnd.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipos_ventas")
public class Tipo_Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String descripcion;

    public Tipo_Venta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
