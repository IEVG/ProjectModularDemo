package com.fe.dev.isa.servicio;

import com.fe.dev.isa.modelo.Persona;

public class Saludador {
    public String saludar(Persona persona) {
        return "¡Hola, " + persona.getNombre() + "!";
    }
}
