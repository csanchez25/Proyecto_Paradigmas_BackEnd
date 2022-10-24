package com.ventas.sistema.Proyecto_BackEnd.api;

import com.ventas.sistema.Proyecto_BackEnd.entity.Producto;
import com.ventas.sistema.Proyecto_BackEnd.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/productos")
public class ProductoRest {
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Producto>> findAll(){
        List<Producto> list = new ArrayList<>();
        productoRepository.findAll().forEach(e->list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity create(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoRepository.save(producto));
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Producto> producto = productoRepository.findById(id);
        if (!producto.isPresent()){
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(producto.get());
    }

    @PutMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Producto> update(@RequestBody Producto producto){
        if(!productoRepository.findById(producto.getId()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productoRepository.save(producto));
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id){
        if(!productoRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        productoRepository.delete(productoRepository.findById(id).get());
        return ResponseEntity.ok().build();
    }
}