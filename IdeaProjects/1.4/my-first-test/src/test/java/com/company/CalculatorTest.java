package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;
    @Before
    public void runBeforeEachIndividualTest(){
        calc = new Calculator();
    }

    @Test
    public void shouldAddTwoPositiveIntegers(){
//        Calculator calc = new Calculator();
        int actualResult = calc.add(4,8);
        int expectedResult = 12;
        assertEquals(expectedResult, actualResult);
        assertEquals(100, calc.add(50,50));
        assertEquals(3,calc.add(2,1));
    }

    @Test
    public void shouldAddTwoNegativeIntegers(){
//        Calculator calc = new Calculator();
        int actualResult = calc.add(-10,-3);
        int expectedResult = -13;
        assertEquals(expectedResult, actualResult);

        assertEquals(-19, calc.add(-30,11));
    }

    @Test
    public void shouldAddPositiveAndNegative(){
//        Calculator calc = new Calculator();
        int actualResult = calc.add(-5,2);
        int expectedResult = -3;
        assertEquals(expectedResult, actualResult);
    }
@Test
public void shouldFindGeorgeWashington() {
    assertEquals("Grover Cleveland", calc.findPresidentNumber(1));
}
    @Test
    public void shouldDivideIntegers(){
//        Calculator calc = new Calculator();
        int actualResult = calc.divide(12,3);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
        assertEquals(3,calc.divide(12,4));
        assertEquals(-3, calc.divide(12,-4));
    }

    @Test
    public void shouldDivideTwoZeroIntegers(){
//        Calculator calc = new Calculator();
        int actualResult = calc.divide(10,0);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
        assertEquals(0,calc.divide(0,10));

    }



}