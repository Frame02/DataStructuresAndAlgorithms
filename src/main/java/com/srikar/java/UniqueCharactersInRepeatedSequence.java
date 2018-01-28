package com.srikar.java;

/**
 * Created by vedantas on 1/28/2018.
 */
public class UniqueCharactersInRepeatedSequence {
    /*
        Algorithm
        =========
        1. Loop through the original sequence.
        2. Check if the current character is already encountered by looping through a buffer.
        (The second loop can be avoided if an auxiliary data structure such as HashSet is allowed)
     */

    private String sequence;
    private StringBuilder sb;

    public UniqueCharactersInRepeatedSequence(String sequence){
        this.sequence = sequence;
        this.sb = new StringBuilder();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public void findUniqueCharacters(){
        for(int i = 0; i < sequence.length(); ++i){
            char ch = sequence.charAt(i);
            if(!checkIfPresent(ch)){
                sb.append(ch);
                // If nth repeated character is asked for, add logic here
                // to keep track of the unique characters count and return
                // the same. Also, the current index position, i, can also be
                // returned.
            }
        }
    }

    private boolean checkIfPresent(char ch){
        boolean result = false;
        for(int i = 0; i < sb.length(); ++i){
            if(sb.charAt(i) == ch){
                result = true;
                break;
            }
        }
        return result;
    }

    public String getUniqueCharactersSequence(){
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "TempleTempleTempleTempleTemple";
        UniqueCharactersInRepeatedSequence ucirs = new UniqueCharactersInRepeatedSequence(s);
        ucirs.findUniqueCharacters();
        System.out.printf("Unique characters in the sequence: %s", ucirs.getUniqueCharactersSequence());
    }
}
