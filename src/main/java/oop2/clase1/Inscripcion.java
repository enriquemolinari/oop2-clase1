package oop2.clase1;

import java.time.LocalDateTime;

public class Inscripcion {
    private Participante participante;
    private LocalDateTime fechaInscripcion;

    public Inscripcion(Participante participante, LocalDateTime fechaInscripcion) {
        this.participante = participante;
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean estaInscripto(Participante participante) {
        return this.participante.equals(participante);
    }
}
