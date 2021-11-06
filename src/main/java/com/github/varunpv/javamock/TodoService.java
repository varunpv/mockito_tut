package com.github.varunpv.javamock;

import java.util.List;
//external service
public interface TodoService {
    public List<String> retreiveTodos(String user);
}
