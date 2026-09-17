package service;

import org.junit.Before;
import org.junit.Test;
import model.Modelo;
import static org.junit.Assert.*;

public class ModeloTest {

    private Modelo model;


    @Before
    public void setUp() throws Exception {
        model = new Modelo();
    }

    @Test
    public void testSumar() {
        model.setNumeroUno(15);
        model.setNumeroDos(20);
        model.sumar();
        assertEquals(35, model.getResultado());
    }

    @Test
    public void testRestar() {
        model.setNumeroUno(50);
        model.setNumeroDos(18);
        model.restar();
        assertEquals(32, model.getResultado());
    }

    @Test
    public void testMultiplicar() {
        model.setNumeroUno(10);
        model.setNumeroDos(5);
        model.multiplicar();
        assertEquals(50, model.getResultado());
    }

    @Test
    public void testDividir() {
        model.setNumeroUno(100);
        model.setNumeroDos(4);
        model.dividir();
        assertEquals(25, model.getResultado());
    }
}