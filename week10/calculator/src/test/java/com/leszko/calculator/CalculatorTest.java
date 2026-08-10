package com.leszko.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/** Unit tests for the Calculator sum logic. */
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSumPositiveNumbers() {
        assertEquals(6, calculator.sum(2, 3));
    }

    @Test
    public void testSumWithZero() {
        assertEquals(7, calculator.sum(7, 0));
    }

    @Test
    public void testSumNegativeNumbers() {
        assertEquals(-8, calculator.sum(-3, -5));
    }
}
