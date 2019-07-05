package com.stackroute.javape5;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CalculateNumberOfOccurrenceOfWordTest {
    CalculateNumberOfOccurrenceOfWord objCalculateNumberOfOccurrenceOfWord;

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Before
    public void setUp(){
        objCalculateNumberOfOccurrenceOfWord=new CalculateNumberOfOccurrenceOfWord();
    }

    @After
    public void tearDown(){
        objCalculateNumberOfOccurrenceOfWord=null;
    }

    @Test
    public void givenStringShouldReturnWordsAndNumberOfOccurrence() {
        // arrange

        // act
        HashMap<String,Integer> result= objCalculateNumberOfOccurrenceOfWord.calculateNumberOfOccurrenceOfWord
                ("one one -one___two,,three,one @three*one?two");

        // assert
        assertEquals(Map.of(
                "one", 5,
                "two", 2,
                "three",2
        ),result);
    }

    @Test
    public void givenNullShouldReturnNull() {
        // arrange

        // act
        HashMap<String,Integer> result= objCalculateNumberOfOccurrenceOfWord.calculateNumberOfOccurrenceOfWord
                ("one one -one___two,,three,one @three*one?two");

        // assert
        assertNull(null);
    }

    @Test
    public void givenNumericSrtingShouldReturnNumberOfOccurrences() {
        // arrange

        // act
        HashMap<String,Integer> result= objCalculateNumberOfOccurrenceOfWord.calculateNumberOfOccurrenceOfWord
                ("1..678{0-6 678");

        // assert
        assertEquals(Map.of(
                "1", 1,
                "678", 2,
                "0",1,
                "6",1
        ),result);
    }
}