package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(0, calculadora.sumar(-1, 1));
        System.out.print("La suma total es: "+ calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.restar(3, 2));
        assertEquals(-2, calculadora.restar(-1, 1));
        System.out.print("La resta total es: "+ calculadora.restar(8, 3));
    }
}
