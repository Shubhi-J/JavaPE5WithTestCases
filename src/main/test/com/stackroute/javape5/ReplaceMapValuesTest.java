package com.stackroute.javape5;

import org.junit.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class ReplaceMapValuesTest {
    ReplaceMapValues objReplaceMapValues;

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Before
    public void setUp(){
        objReplaceMapValues=new ReplaceMapValues();
    }

    @After
    public void tearDown(){
        objReplaceMapValues=null;
    }

    @Test
    public void givenTwoKeyValuesShouldReturnVal1AsVal2() {
        // arrange

        // act
        HashMap<String,String> result= objReplaceMapValues.replaceValueAtKey2ToValueAtKey1(Map.of("val1","java",
                "val2","c++"));


        // assert
        assertEquals(Map.of("val1","",
                "val2","java"),result);
    }

    @Test
    public void givenThreeKeyValuesShouldReturnWrongInput() {
        // arrange

        // act
        HashMap<String,String> result= objReplaceMapValues.replaceValueAtKey2ToValueAtKey1(Map.of("val1","java",
                "val2","c++",
        "val3","c#"));


        // assert
        assertEquals(Map.of("output","Wrong input"),result);
    }
}