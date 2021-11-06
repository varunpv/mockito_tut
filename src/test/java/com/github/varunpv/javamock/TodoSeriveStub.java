package com.github.varunpv.javamock;

import java.util.Arrays;
import java.util.List;

public class TodoSeriveStub implements TodoService {

    @Override
    public List<String> retreiveTodos(String user) {
        return Arrays.asList("yogapants","beeryoga","niceyoga","bs");
    }
}
