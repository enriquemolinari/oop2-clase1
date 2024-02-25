package oop2.clase1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConcursoTest {
    @Test
    public void test01() {
        var jose = new Participante("234566", "Jose Perez");
        Concurso unConcurso = new Concurso("Un Concurso");
        Inscripcion.inscribirAEn(jose, unConcurso);
        assertTrue(unConcurso.participanteInscripto(jose));
        assertEquals(1, unConcurso.cantidadInscriptos());
    }

    @Test
    public void test02() {
        Concurso unConcurso = new Concurso("Un Concurso");
        assertEquals(0, unConcurso.cantidadInscriptos());
    }

    @Test
    public void test03() {
        var jose = new Participante("234566", "Jose Perez");
        Concurso unConcurso = new Concurso("Un Concurso");
        assertFalse(unConcurso.participanteInscripto(jose));
    }

    @Test
    public void test04() {
        var jose1 = new Participante("234566", "Jose Perez");
        var jose2 = new Participante("234566", "Jose Perez");
        Concurso unConcurso = new Concurso("Un Concurso");
        Inscripcion.inscribirAEn(jose1, unConcurso);
        assertTrue(unConcurso.participanteInscripto(jose2));
        assertEquals(1, unConcurso.cantidadInscriptos());
    }

    @Test
    public void test05() {
        var jose1 = new Participante("234566", "Jose Perez");
        var jorge = new Participante("698712", "Jorge Saldivar");
        Concurso unConcurso = new Concurso("Un Concurso");
        Inscripcion.inscribirAEn(jose1, unConcurso);
        Inscripcion.inscribirAEn(jorge, unConcurso);
        assertTrue(unConcurso.participanteInscripto(jorge));
        assertEquals(2, unConcurso.cantidadInscriptos());
    }
}