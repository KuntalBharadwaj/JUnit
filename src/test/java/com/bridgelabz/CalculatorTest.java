package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;
    private int a;
    private int b;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
        a = 10;
        b = 0;
    }

    @Test
    void shouldAddingCorrectly(){
        Assertions.assertEquals(10,calculator.addTwoNumber(a,b));
    }

    @Test
    void shouldSubtractCorrectly(){
        Assertions.assertEquals(10,calculator.subtractTwoNumber(a,b));
    }

    @Test
    void shouldMultiplyCorrectly(){
        Assertions.assertEquals(0,calculator.multiplyTwoNumber(a,b));
    }

    @Test
    void shouldDivideCorrectly(){
        Assertions.assertThrows(ArithmeticException.class,()->{
            calculator.divideTwoNumber(a,b);
        });
    }
}
