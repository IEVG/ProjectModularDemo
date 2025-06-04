package com.fe.dev.isa.app;

import com.fe.dev.isa.modelo.Persona;
import com.fe.dev.isa.servicio.Saludador;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Persona persona = new Persona("Lucía");
        Saludador saludador = new Saludador();
        System.out.println(saludador.saludar(persona));
    }
}
