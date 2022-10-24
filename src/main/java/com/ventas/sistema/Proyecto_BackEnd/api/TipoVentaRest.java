package com.ventas.sistema.Proyecto_BackEnd.api;

import com.ventas.sistema.Proyecto_BackEnd.entity.Tipo_Venta;
import com.ventas.sistema.Proyecto_BackEnd.repository.TipoVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tipoVentas")
public class TipoVentaRest {
    @Autowired
    private TipoVentaRepository tipoVentaRepository;

    @GetMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Tipo_Venta>> findAll(){
        List<Tipo_Venta> list = new ArrayList<>();
        tipoVentaRepository.findAll().forEach(e-> list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity create(@RequestBody Tipo_Venta tipoVenta){
        return ResponseEntity.ok(tipoVentaRepository.save(tipoVenta));
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity findById(@PathVariable Long id){
        Optional<Tipo_Venta> tipoVenta = tipoVentaRepository.findById(id);
        if (!tipoVenta.isPresent()){
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(tipoVenta.get());
    }

    @PutMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Tipo_Venta> update(@RequestBody Tipo_Venta tipoVenta){
        if (!tipoVentaRepository.findById(tipoVenta.getId()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(tipoVentaRepository.save(tipoVenta));
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id){
        if (!tipoVentaRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        tipoVentaRepository.delete(tipoVentaRepository.findById(id).get());
        return ResponseEntity.ok().build();
    }


}

