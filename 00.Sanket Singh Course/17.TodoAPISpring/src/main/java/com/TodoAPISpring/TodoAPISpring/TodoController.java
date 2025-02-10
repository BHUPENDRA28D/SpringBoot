package com.TodoAPISpring.TodoAPISpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private static List<Todo> todosList;

//    Constructor.
    public TodoController(){
        todosList = new ArrayList<>();
        todosList.add(new Todo(1,1,"Todo 1",false));
        todosList.add(new Todo(1,1,"Todo 2",true));
    }


    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todosList;
    }

}
