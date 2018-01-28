package com.srikar.java;

/**
 * Created by vedantas on 1/28/2018.
 */
public class Pyramid {
    /*
        Algorithm
        =========
        1. For each row, print (n - row) number of spaces and then followed by (2 * row - 1) of '*'
        (The prefixed spaces will eventually form am empty inverted right triangle)
     */

    private int n;

    public Pyramid(int n) {
        this.n = n;
    }

    public void printPyramid() {
        // Iterate row by row
        for (int i = 1; i <= n; ++i) {
            // First print (n - row) spaces
            for (int k = 0; k < n - i; ++k) {
                System.out.print("  ");
            }
            // Print (2 * row - 1) number of '*'
            for (int j = 0; j < (2 * i - 1); ++j) {
                System.out.print("* ");
            }
            // Printing of trailing empty spaces is not required
            // (as they're not visible)!
            /*for(int k = 0; k < n - i; ++k){
                System.out.print("  ");
            }*/
            // Print a new line to proceed to next line/row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid(15);
        p.printPyramid();
    }
}
