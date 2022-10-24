package com.ventas.sistema.Proyecto_BackEnd.api;

import com.ventas.sistema.Proyecto_BackEnd.entity.Venta;
import com.ventas.sistema.Proyecto_BackEnd.entity.Persona;
import com.ventas.sistema.Proyecto_BackEnd.entity.Producto;
import com.ventas.sistema.Proyecto_BackEnd.entity.Tipo_Venta;
import com.ventas.sistema.Proyecto_BackEnd.repository.VentaRepository;
import com.ventas.sistema.Proyecto_BackEnd.repository.PersonaRepository;
import com.ventas.sistema.Proyecto_BackEnd.repository.ProductoRepository;
import com.ventas.sistema.Proyecto_BackEnd.repository.TipoVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Ventas")
public class VentaRest {

    @Autowired
    private VentaRepository ventaRepository;

    @GetMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Venta>> findAll(){
        List<Venta> list = new ArrayList<>();
        ventaRepository.findAll().forEach(e->list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity create(@RequestBody Venta venta){
        return ResponseEntity.ok(ventaRepository.save(venta));
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Venta> venta = ventaRepository.findById(id);
        if(!venta.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(venta.get());
    }

    @PutMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Venta> update(@RequestBody Venta venta){
        if(!ventaRepository.findById(venta.getId()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(ventaRepository.save(venta));
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id){
        if(!ventaRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        ventaRepository.delete(ventaRepository.findById(id).get());
        return ResponseEntity.ok().build();
    }

}
