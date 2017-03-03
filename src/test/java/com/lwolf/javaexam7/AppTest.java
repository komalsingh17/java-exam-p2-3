package com.lwolf.javaexam7;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testMergeLists() {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 4, 6));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
        List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> actualList = App.mergeLists(list1, list2);

        assertEquals(expectedList, actualList);
        list1 = new ArrayList<Integer>(Arrays.asList(10, 19, 27));
        list2 = new ArrayList<Integer>(Arrays.asList(7, 25, 40));
        expectedList = new ArrayList<Integer>(Arrays.asList(7, 10, 19, 25, 27, 40));

        actualList = App.mergeLists(list1, list2);

        assertEquals(expectedList, actualList);
    }
}
