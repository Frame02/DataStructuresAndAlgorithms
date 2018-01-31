package com.srikar.java;

/**
 * Created by vedantas on 1/30/2018.
 */
public class PalindromeChecker {
    private String input;

    public PalindromeChecker(String s) {
        this.input = s;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String s) {
        this.input = s;
    }

    public boolean isPalindrome() {
        int i = 0, j = input.length() - 1;
        boolean result = true;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                result = false;
                break;
            }
            ++i;
            --j;
        }
        return result;
    }

    public static void main(String[] args) {
        PalindromeChecker pc  = new PalindromeChecker("malayalam");
        System.out.println("Is '" + pc.getInput() + "' a palindrome? " + pc.isPalindrome());
    }
}
