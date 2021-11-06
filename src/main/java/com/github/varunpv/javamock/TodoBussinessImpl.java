package com.github.varunpv.javamock;

import java.util.ArrayList;
import java.util.List;
public class TodoBussinessImpl {
    private TodoService todoService;
    public TodoBussinessImpl( TodoService todoService){
        this.todoService = todoService;
    }
    public List<String> retrieveTodosRelatedToYoga(String user){
        List<String> filteredTodos = new ArrayList<>();
        List<String> allTodos = todoService.retreiveTodos(user);
        for(String todo: allTodos){
            if( todo.contains("yoga") ){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
