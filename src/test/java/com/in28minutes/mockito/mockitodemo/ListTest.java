package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testSize(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
        assertEquals(10, listMock.size());
    }

    @Test
    public void testSize_multipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(20, listMock.size());
    }

    /**
     * Use parameter
     * Note:
     * if There are multiple parameters,
     * you cannot use specific parameter & generic parameter both
     * use specific parameter with the specific parameter only
     * use generic parameter with the generic parameter only
     */

    @Test
    public void testGet_SpecificParameter(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGet_GenericParameter(){
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals("Some String", listMock.get(1));
    }
}
