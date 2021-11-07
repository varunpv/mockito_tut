package com.github.varunpv.javamock;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TodoBussinessImplMockTest {
    @Mock
    TodoService todoService;

    @Test
    public void usingMockito() {

        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");
        when(todoService.retreiveTodos("Ranga")).thenReturn(allTodos);
        TodoBussinessImpl todoBusinessImpl = new TodoBussinessImpl(todoService);
        List<String> todos = todoBusinessImpl.retrieveTodosRelatedToYoga("Yoga");
        assertEquals(0, todos.size());
    }
}