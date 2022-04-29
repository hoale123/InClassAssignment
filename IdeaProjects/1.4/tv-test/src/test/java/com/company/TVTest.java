package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {
    //TV = type
    private TV television;

    @Before
    public void setUp(){
        television = new TV(9);
    }

    @Test
    public void shouldTurnOn(){
//        TV television = new TV();
//        television.turnOn();
        television.setOn(true);
        boolean actualValue = television.isOn();
        boolean expectedValue = true;

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldTurnOff(){
//        TV television = new TV();
        television.turnOff();

        boolean actualValue = television.isOn();
        boolean expectedValue = false;

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldBeOffAfterTurnedOnAndThenOff(){
//        TV television = new TV();
        television.turnOn();
        television.turnOff();

        boolean actualValue = television.isOn();
        boolean expectedValue = false;

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldTurnOnAtASpecificChannel(){
        int actualValue = television.getChannel();
        int expectedValue = 9;

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldIncreaseChannel(){
        television.increaseChannel();
        television.increaseChannel();
        television.increaseChannel();

        int actualValue = television.getChannel();
        int expectedValue = 12;

        assertEquals(expectedValue, actualValue);
    }

}