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
        boolean esta = false;
        int i = 0;
        List<Inscripcion> l = this.inscriptos;
        while (!esta && i < l.size()) {
            if (l.get(i).estaInscripto(participante)) {
                esta = true;
            } else {
                i++;
            }
        }
        return esta;
    }

    public void nuevaInscripcion(Inscripcion inscripcion) {
        this.inscriptos.add(inscripcion);
    }

    public int cantidadInscriptos() {
        return this.inscriptos.size();
    }
}
