package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockAnnotationsTest {

    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindTheGreatestFromAllData(){
        when(dataService.retrieveAllData()).thenReturn(new int [] {24,8,9});
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        assertEquals(theGreatestFromAllData, 24);
    }
}