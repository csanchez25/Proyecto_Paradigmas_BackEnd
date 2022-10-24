package com.ventas.sistema.Proyecto_BackEnd.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String tipoVenta;

    private String persona;

    private String producto;

    private int cantidad;

    private Date fecha;

    public Venta() {}


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTipoVenta() { return tipoVenta; }

    public void setTipoVenta(String tipoVenta) { this.tipoVenta = tipoVenta; }

    public String getPersona() { return persona; }

    public void setPersona(String persona) { this.persona = persona; }

    public String getProducto() { return producto; }

    public void setProducto(String producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Date getFecha() { return fecha; }

    public void setFecha(Date fecha) { this.fecha = fecha; }

}

