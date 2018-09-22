package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessImplStubTest {

    @Test
    public void testFindTheGreatestFromAllData(){
        SomeBusinessImpl someBusiness =
                new SomeBusinessImpl(new DataServiceStub());
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        assertEquals(theGreatestFromAllData, 24);
    }
}

/**
 * Using Stub
 * Disadvantages :
 * - lot of code to maintain as follow
 * - multiple stub class to handle different scenarios
 */
class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[] {24,6,8};
    }
}