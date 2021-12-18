package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest2 {

    private Calculator calculator;

    @BeforeEach
    void setUp() throws Exception {
        calculator = new Calculator();
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        Assumptions.assumeFalse(System.getProperty("os.name").contains("Linux"));

        assertEquals(calculator.multiply(0, 5), 0, "Multiple with zero should be zero");
        assertEquals(calculator.multiply(5, 0), 0, "Multiple with zero should be zero");
    }
}