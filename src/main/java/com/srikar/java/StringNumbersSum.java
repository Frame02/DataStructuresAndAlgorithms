package com.srikar.java;

/**
 * Created by vedantas on 1/28/2018.
 */
public class StringNumbersSum {
    /*
        Algorithm
        =========
        1. Parse the string looking for a delimiter and extract numeric substrings
        2. Convert the numeric substring to an Integer using Integer.parseInt()
        3. Add the number to sum
     */

    private String sumString;

    public StringNumbersSum(String s){
        this.sumString = s;
    }

    public int calculateSum(){
        int sum = 0, i = 0;
        for(int j = 0; j < sumString.length(); ++j){
            if(sumString.charAt(j) == ',' || (j == sumString.length() - 1)){
                if(j == sumString.length() - 1)
                    ++j;
                sum += Integer.parseInt(sumString.substring(i, j));
                i = j + 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        StringNumbersSum sns = new StringNumbersSum("9,99,9,999");
        System.out.println("Calculated sum: " + sns.calculateSum());
    }

}
