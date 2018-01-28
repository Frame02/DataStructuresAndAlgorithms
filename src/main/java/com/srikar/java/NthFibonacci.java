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

    // Calculating Fibonacci recursively (Inefficient)
    public long calculateFibonacci(int n){
        if(n == -1){
            return -1;
        }
        if(n == 0){
            return 1;
        }
        else
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        NthFibonacci nf = new NthFibonacci(30);
        System.out.printf("%dth Fibonacci: %d\n", nf.getN(), nf.calculate());
        System.out.printf("%dth Fibonacci: %d\n", nf.getN(), nf.calculateFibonacci(nf.getN()));
    }
}

