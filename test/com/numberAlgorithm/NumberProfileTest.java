//package com.numberAlgorithm;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class NumberProfileTest {
//    NumberProfile digit;
//    @BeforeEach
//    void setUp() {
//        digit = new NumberProfile();
//    }
//
//    @AfterEach
//    void tearDown() {
//        digit = null;
//    }
//
//    @Test
//    void checkIfADigitIsEven(){
//        int number = 6;
//        assertTrue(digit.isEven(number));
//    }
//
//    @Test
//    void checkIfDigitIsOdd(){
//        int number = 6;
//        assertTrue(digit.isOdd(number));
//
//    }
//
//    @Test
//    void checkIFDigitIsPrime(){
//        int number = 6;
//        assertTrue(digit.isPrime(number));
//    }
//
//}