package com.srikar.java;

/**
 * Created by vedantas on 1/28/2018.
 */
public class PowerCalculationBacktrack {
    /*
        Algorithm
        =========

        1. Calculate power of a specified number using iteration in recursive fashion
     */
    private int n;
    private int power;
    private long value = 1;

    public PowerCalculationBacktrack(int n, int power){
        this.n = n;
        this.power = power;
    }

    public long calculate(){
        calculate(power);
        return value;
    }

    private void calculate(int i){
        if (i == 0)
            return;
        value *= n;
        calculate(i - 1);
    }

    public static void main(String[] args) {
        PowerCalculationBacktrack pcb = new PowerCalculationBacktrack(2, 8);
        System.out.println("Calculated power value: " + pcb.calculate());
    }
}
