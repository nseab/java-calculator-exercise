package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }
    @Test
    
    @DisplayName("Divide two numbers")
    public void testDivide() {
        final Integer division = Calculator.divide(16, 4);       
        assertEquals(4, division);
        
    }
    @Test
    public void testDivideZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(16, 0);
        });
    }
    
    @Test
    @DisplayName("Multiply two numbers")
    public void testMultiply() {
        final Integer multiply = Calculator.multiply(6, 3);
        assertEquals(18, multiply);
        
    }
    
}
