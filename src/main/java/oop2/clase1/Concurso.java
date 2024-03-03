package oop2.clase1;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private final String nombre;
    private List<Inscripcion> inscriptos;

    public Concurso(String nombre) {
        this.nombre = nombre;
        this.inscriptos = new ArrayList<>();
    }

    public boolean participanteInscripto(Participante participante) {
        for (Inscripcion inscripcion : this.inscriptos) {
            if (inscripcion.estaInscripto(participante)) {
                return true;
            }
        }
        return false;
    }

    public void nuevaInscripcion(Inscripcion inscripcion) {
        this.inscriptos.add(inscripcion);
    }

    public int cantidadInscriptos() {
        return this.inscriptos.size();
    }
}
