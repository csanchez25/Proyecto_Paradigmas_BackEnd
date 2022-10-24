package com.ventas.sistema.Proyecto_BackEnd.aop;

import com.ventas.sistema.Proyecto_BackEnd.entity.Log;
import com.ventas.sistema.Proyecto_BackEnd.repository.LogRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


@Aspect
@Component
public class SystemAOP {

    @Autowired
    private LogRepository logRepository;

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.PersonaRest.findAll(..))")
    public void logBeforeFindAllPersona(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Persona");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.PersonaRest.create(..))")
    public void logBeforeCreatePersona(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Persona");
        logRepository.save(log);
    }
    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.PersonaRest.update(..))")
    public void logBeforeUpdatePersona(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Persona");
        logRepository.save(log);
    }
    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.PersonaRest.delete(..))")
    public void logBeforeDeletePersona(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Persona");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.ProductoRest.findAll(..))")
    public void logBeforeFindAllProducto(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Producto");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.ProductoRest.create(..))")
    public void logBeforeCreateProducto(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Producto");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.ProductoRest.update(..))")
    public void logBeforeUpdateProducto(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Producto");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.ProductoRest.delete(..))")
    public void logBeforeDeleteProducto(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Producto");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.TipoVentaRest.findAll(..))")
    public void logBeforeFindAllTipoVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Tipo Venta");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.TipoVentaRest.create(..))")
    public void logBeforeCreateTipoVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Tipo Venta");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.TipoVentaRest.update(..))")
    public void logBeforeUpdateTipoVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Tipo Venta");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.TipoVentaRest.delete(..))")
    public void logBeforeDeleteTipoVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Tipo Venta");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.VentaRest.findAll(..))")
    public void logBeforeFindAllVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Venta");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.VentaRest.create(..))")
    public void logBeforeCreateVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Venta");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.VentaRest.update(..))")
    public void logBeforeUpdateVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Venta");
        logRepository.save(log);
    }

    @Before("execution(* com.ventas.sistema.Proyecto_BackEnd.api.VentaRest.delete(..))")
    public void logBeforeDeleteVenta(JoinPoint joinPoint){
        Date fecha = new Date();
        Log log = new Log();
        log.setMetodo(joinPoint.getSignature().getName());
        log.setFecha(fecha);
        log.setDescripcion("Venta");
        logRepository.save(log);
    }
}
