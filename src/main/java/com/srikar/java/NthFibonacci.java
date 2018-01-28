package com.srikar.java;

/**
 * Created by vedantas on 1/28/2018.
 */
public class NthFibonacci {
    /*
        Algorithm
        =========

        1. Iterate in a loop.
        2. Keep track of last two fibonacci numbers and calculate their sum
    */
    private int n;

    public NthFibonacci(int n) {
        this.n = n;
    }

    public long calculate() {
        long nthFibonacci = 0;
        long i = -1, j = 1;
        for (int k = 0; k < n; ++k) {
            nthFibonacci = i + j;
            i = j;
            j = nthFibonacci;
        }
        return nthFibonacci;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        NthFibonacci nf = new NthFibonacci(30);
        System.out.printf("%dth Fibonacci: %d", nf.getN(), nf.calculate());
    }
}

