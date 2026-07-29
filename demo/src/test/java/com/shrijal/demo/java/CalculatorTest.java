package com.shrijal.demo.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.shrijal.demo.Java.Calculator;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition(){
        int result = calculator.add(10,20);
        assertEquals(30,result);
    }

    @Test
    void testSubtraction(){
        int result = calculator.subtract(20,10);
        assertEquals(10,result);
    }

    @Test
    void testMultiplication(){
        int result = calculator.multiply(20,10);
        assertEquals(200,result);
    }

    @Test
    void testDivision(){
        int result = calculator.divide(20,10);
        assertEquals(2,result);
    }
}


// we donnot need main class because junit will find the function where @test is written
// and will run the function

// src class is independent of the test class