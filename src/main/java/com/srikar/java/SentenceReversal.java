package com.srikar.java;

public class SentenceReversal {
    /*
        Algorithm
        =========
        1. Reverse each individual word in the sentence
        2. Reverse the entire string
     */

    private StringBuffer sb;

    public SentenceReversal(String s){
        sb = new StringBuffer(s);
    }

    private void reverseSubstring(int i, int j){
        for(; i < j; ++i, --j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
        }
    }

    public void reverse(){
        // Traverse the entire string length
        for(int i = 0, j = 0; i < sb.length(); ++i){
            if(sb.charAt(i) == ' '){
                reverseSubstring(j, i - 1);
                // Skip whitespace
                while(i < sb.length() && sb.charAt(i) == ' '){
                    j = ++i;
                }
            }
            else if(i == (sb.length() -1)){
                reverseSubstring(j, i);
            }
        }
        reverseSubstring(0, sb.length() - 1);
    }

    public String getSentence(){
        return sb.toString();
    }

    public static void main(String[] args){
        SentenceReversal sr = new SentenceReversal("pos   1 No. In ");
        sr.reverse();
        System.out.println("Reversed string: {}".format(sr.getSentence()));
    }

}
