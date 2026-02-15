package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    public void treePlusSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));
    }

}
