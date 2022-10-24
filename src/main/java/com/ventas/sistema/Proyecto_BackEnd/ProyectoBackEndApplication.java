package com.ventas.sistema.Proyecto_BackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ProyectoBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoBackEndApplication.class, args);
	}

}
