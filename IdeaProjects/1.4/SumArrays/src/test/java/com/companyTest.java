package com;

import com.company.SumArrays;
import org.junit.Test;

import static org.junit.Assert.*;

public class companyTest {
    @Test
    public void shouldSumToArrays(){
        SumArrays sumArrays = new SumArrays();
        //making an array
        int[] arrayA = {2,3};
        int[] arrayB = {1,5,5};
        int actualResult = sumArrays.sum(arrayA,arrayB);
        int expectedResult = 16;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void shouldAddEmptyArrays(){
        int[] empty = {};

        assertEquals(0,SumArrays.sum(empty,empty));
    }
    @Test
    public void shouldArrayify(){
        SumArrays sumArrays = new SumArrays();
            int[] actualResult = sumArrays.arrayify(2,3);
            int[] expectedResult = {3,4};
            assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void shouldReturnEmptyArrayWhenLengthIsNeg(){
        int[] empty = {};

        assertArrayEquals(empty,SumArrays.arrayify(-1,0));
    }


    //if negative
    // number , return empty array.
    //
    //why assertArrayEquals - same length , and same index, not same on the heap, but all the element is the same.
    //assertEquals -

}