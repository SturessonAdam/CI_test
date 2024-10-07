package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // given
        Calculator calc = new Calculator();

        //when
        int result = calc.add(5, 5);

        //then
        assertEquals(10, result);
    }

    @Test
    void subtract() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.subtract(10, 5);

        //then
        assertEquals(5, result);

    }
}