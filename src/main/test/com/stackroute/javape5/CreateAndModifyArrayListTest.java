package com.stackroute.javape5;

import org.junit.*;

import static org.junit.Assert.*;

public class CreateAndModifyArrayListTest {
    CreateAndModifyArrayList objCreateAndModifyArrayList;

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Before
    public void setUp(){
        objCreateAndModifyArrayList=new CreateAndModifyArrayList();
    }

    @After
    public void tearDown(){
        objCreateAndModifyArrayList=null;
    }

    @Test
    public void givenIndex1AndItemToBeChangedShouldReturnUpdatedList() {
        // arrange

        // act
        String result= objCreateAndModifyArrayList.ModifyAndDisplayArrayList(0,"kiwi");

        // assert
        assertEquals("input list is : [apple, grape, melon, berry] \n" +
                "updated list is : [kiwi, grape, melon, berry] \n" +
                "input list after removing all elements []",result);
    }
    @Test
    public void givenIndex3AndItemToBeChangedShouldReturnUpdatedList() {
        // arrange

        // act
        String result= objCreateAndModifyArrayList.ModifyAndDisplayArrayList(2,"mango");

        // assert
        assertEquals("input list is : [apple, grape, melon, berry] \n" +
                "updated list is : [apple, grape, mango, berry] \n" +
                "input list after removing all elements []",result);
    }
}