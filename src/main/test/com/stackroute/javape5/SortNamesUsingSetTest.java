package com.stackroute.javape5;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

public class SortNamesUsingSetTest {
    SortNamesUsingSet objSortNamesUsingSet;

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Before
    public void setUp(){
        objSortNamesUsingSet=new SortNamesUsingSet();
    }

    @After
    public void tearDown(){
        objSortNamesUsingSet=null;
    }

    @Test
    public void givenUnorderedSetOfNamesShouldReturnOrderedSetAndListOfNames() {
        // arrange

        // act
        String result= objSortNamesUsingSet.sortNamesUsingSet(new HashSet<String>
                (Arrays.asList(new String[] {"Harry" ,"Olive","Alice", "Bluto", "Eugene" })));


        // assert
        assertEquals("Sorted set: [Alice, Bluto, Eugene, Harry, Olive]\n" +
                "Array list from set: [Alice, Bluto, Eugene, Harry, Olive]",result);
    }
    @Test
    public void givenOrderedSetOfNamesShouldReturnOrderedSetAndListOfNames() {
        // arrange

        // act
        String result= objSortNamesUsingSet.sortNamesUsingSet(new HashSet<String>
                (Arrays.asList(new String[] {"Alice", "Bluto", "Eugene","Harry" ,"Olive"})));


        // assert
        assertEquals("Sorted set: [Alice, Bluto, Eugene, Harry, Olive]\n" +
                "Array list from set: [Alice, Bluto, Eugene, Harry, Olive]",result);
    }
    @Test
    public void givenNullShouldReturnNull() {
        // arrange

        // act
        String result= objSortNamesUsingSet.sortNamesUsingSet(new HashSet<String>
                (Arrays.asList(new String[] {})));


        // assert
        assertNull(null);
    }
}