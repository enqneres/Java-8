package com.teste;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MatcherTest {
    @Test
    public void testList(){
        List<String> mocklist = mock(List.class);

        when(mocklist.get(Mockito.anyInt())).thenReturn("Mockito");

        assertEquals("Mockito", mocklist.get(0));
        assertEquals("Mockito",mocklist.get(1));
        assertEquals("Mockito",mocklist.get(2));
    }
    }
