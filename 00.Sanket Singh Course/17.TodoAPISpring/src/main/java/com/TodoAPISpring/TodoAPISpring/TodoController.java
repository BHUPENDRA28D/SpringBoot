package com.TodoAPISpring.TodoAPISpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //Mapping automaticaly..
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

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo newTodo){
        todosList.add(newTodo);
        return newTodo;
    }


}
