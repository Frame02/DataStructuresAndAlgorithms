package com.srikar.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vedantas on 1/28/2018.
 */

public class SentenceReversalTest {
    @Test
    public void test01(){
        String originalSentence = "pos   1 No. In ";
        SentenceReversal sr = new SentenceReversal(originalSentence);
        sr.reverse();
        String reversedSentence = sr.getSentence();
        assertEquals(reversedSentence, " In No. 1   pos");
    }
}
