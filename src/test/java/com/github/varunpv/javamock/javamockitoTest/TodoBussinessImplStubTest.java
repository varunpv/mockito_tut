package com.github.varunpv.javamock.javamockitoTest;

import com.github.varunpv.javamock.TodoBussinessImpl;
import com.github.varunpv.javamock.TodoSeriveStub;
import com.github.varunpv.javamock.TodoService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TodoBussinessImplStubTest {

    @Test
    public void TestretrieveTodosRelatedToYoga(){
        TodoService todoServicestub= new TodoSeriveStub();
        TodoBussinessImpl todoBussinessimpl= new TodoBussinessImpl(todoServicestub);
        List<String> filteredList= todoBussinessimpl.retrieveTodosRelatedToYoga("varun");
        assertEquals(3, filteredList.size());
    }
}
