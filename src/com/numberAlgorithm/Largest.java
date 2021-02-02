package com.numberAlgorithm;

public class Largest {
    private int counter;
    private int number;
    private int largest;

    public Largest(int counter, int number) {
        this.counter = counter;
        this.number = number;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCounter() {
        return counter;
    }

    public int getNumber() {
        return number;
    }

    public int calculateLargest() {
        if (number > largest) {
            return largest = number;

        }
        return largest;
    }
}


