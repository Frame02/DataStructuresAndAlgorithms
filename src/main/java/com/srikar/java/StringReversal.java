package com.srikar.java;

/**
 * Created by vedantas on 1/30/2018.
 */
public class StringReversal {

    private StringBuilder input;

    public StringReversal(String s) {
        input = new StringBuilder(s);
    }

    public String getInput() {
        return input.toString();
    }

    public String reverse() {
        for (int i = 0, j = input.length() - 1; i < j; ++i, --j) {
            char ch = input.charAt(i);
            input.setCharAt(i, input.charAt(j));
            input.setCharAt(j, ch);
        }
        return input.toString();
    }

    public static void main(String[] args) {
        StringReversal sr = new StringReversal("money");
        System.out.println("Original String: " + sr.getInput());
        System.out.println("Reversed String: " + sr.reverse());
    }
}
