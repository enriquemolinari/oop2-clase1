package oop2.clase1;

import java.util.Objects;

public class Participante {

    private String dni;
    private String nombre;

    public Participante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participante that)) return false;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
