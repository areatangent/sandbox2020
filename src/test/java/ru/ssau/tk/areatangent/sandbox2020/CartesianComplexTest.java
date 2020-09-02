package ru.ssau.tk.areatangent.sandbox2020;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CartesianComplexTest {

    private final static double DELTA = 0.00001;

    @Test
    public void testRe() {
        Complex complex = new CartesianComplex(0, 0);
        assertEquals(complex.re(), 0, DELTA);
        assertNotEquals(complex.re(), 1, DELTA);
    }
}