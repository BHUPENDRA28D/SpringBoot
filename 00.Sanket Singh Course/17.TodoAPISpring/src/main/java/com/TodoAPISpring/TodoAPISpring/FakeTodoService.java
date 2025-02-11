package com.TodoAPISpring.TodoAPISpring;

import org.springframework.stereotype.Service;

@Service
public class FakeTodoService implements TodoService{
    public String doSomething(){
        return "do Something";
    }
}
