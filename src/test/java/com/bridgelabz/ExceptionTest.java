package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    void shouldDivideCorrectly(){
        int a = 10;
        int b = 0;

        Calculator calculator = new Calculator();

        if(b == 0) Assertions.assertThrows(ArithmeticException.class,()->{
            calculator.divideTwoNumber(a,b);
        });
        else Assertions.assertEquals(2,calculator.divideTwoNumber(a,b));
    }
}
