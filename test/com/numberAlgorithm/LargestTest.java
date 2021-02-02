package com.numberAlgorithm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatProgramCanUseVariableCounterAndNumber(){
        Largest largest = new Largest(1, 3);
        largest.setCounter(1);
        largest.setNumber(3);
        assertEquals(1, largest.getCounter());
        assertEquals(3, largest.getNumber());
    }

    @Test
    void testThatProgramCanCalculateTheLargestNumber(){
        Largest largest = new Largest(1, 3);
        largest.calculateLargest();
        assertEquals(3, largest.calculateLargest());


    }
}