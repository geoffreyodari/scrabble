package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testScrabble {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleLetter_2() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("d"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleLetter_3() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("c"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleLetter_4() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 4;
        assertEquals(expected, testScrabble.calculateScore("y"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_5() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 5;
        assertEquals(expected, testScrabble.calculateScore("k"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_8() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 8;
        assertEquals(expected, testScrabble.calculateScore("j"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_10() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 10;
        assertEquals(expected, testScrabble.calculateScore("z"));
    }

    @Test
    public void calculateScore_returnsSumOfScoreOfTwoLetters() throws Exception{
        Scrabble testScrabble = new Scrabble();
        Integer expected = 13;
        assertEquals(expected, testScrabble.calculateScore("cz"));
    }


}
