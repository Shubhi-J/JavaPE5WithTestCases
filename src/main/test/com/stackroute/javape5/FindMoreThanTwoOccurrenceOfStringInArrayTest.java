package com.stackroute.javape5;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindMoreThanTwoOccurrenceOfStringInArrayTest {
    FindMoreThanTwoOccurrenceOfStringInArray objFindMoreThanTwoOccurrenceOfStringInArray;

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Before
    public void setUp(){
        objFindMoreThanTwoOccurrenceOfStringInArray=new FindMoreThanTwoOccurrenceOfStringInArray();
    }

    @After
    public void tearDown(){
        objFindMoreThanTwoOccurrenceOfStringInArray=null;
    }

    @Test
    public void givenStringShouldReturnWordsAndNumberOfOccurrence() {
        // arrange

        // act
        HashMap<String,Boolean> result= objFindMoreThanTwoOccurrenceOfStringInArray.findOccurrenceOfStringInArray
                (new String[] {"a","b","c","d","a","c","c"});

        // assert
        assertEquals(Map.of(
                "a", true,
                "b", false,
                "c",true,
                "d",false
        ),result);
    }

    @Test
    public void givenNullShouldReturnNull() {
        // arrange

        // act
        HashMap<String,Boolean> result= objFindMoreThanTwoOccurrenceOfStringInArray.findOccurrenceOfStringInArray(null);

        // assert
        assertNull(null);
    }

    @Test
    public void givenNumericSrtingWithNullShouldReturnNumberOfOccurrences() {
        // arrange

        // act
        HashMap<String,Boolean> result= objFindMoreThanTwoOccurrenceOfStringInArray.findOccurrenceOfStringInArray
                (new String[]{"1",".675","abc",".675"});

        // assert
        assertEquals(Map.of(
                "1",false,
                ".675", true,
                "abc",false
        ),result);
    }
}