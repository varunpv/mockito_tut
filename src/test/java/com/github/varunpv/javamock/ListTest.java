package com.github.varunpv.javamock;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void test(){
        List listMock= mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(listMock.size(),2);
    }
}
