package oop2.clase1;

import java.time.LocalDateTime;

public class Inscripcion {
    private Participante participante;
    private Concurso concurso;
    private LocalDateTime fechaInscripcion;

    private Inscripcion(Participante participante, Concurso concurso, LocalDateTime fechaInscripcion) {
        this.participante = participante;
        this.concurso = concurso;
        this.fechaInscripcion = fechaInscripcion;
    }

    public static void inscribirAEn(Participante unParticipante, Concurso unConcurso) {
        var nuevaInscripcion = new Inscripcion(unParticipante, unConcurso, LocalDateTime.now());
        unConcurso.nuevaInscripcion(nuevaInscripcion);
    }

    public boolean estaInscripto(Participante participante) {
        return this.participante.equals(participante);
    }
}
