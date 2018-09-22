package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {

    @Test
    public void testFindTheGreatestFromAllData(){
        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int [] {24,8,9});
        //using constructor injection to pass the mock, as follow
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        assertEquals(theGreatestFromAllData, 24);
    }
}