package com.TodoAPISpring.TodoAPISpring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
/*
    @PostMapping("/todos")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo newTodo){
        todosList.add(newTodo);
        return newTodo;
    }*/



    @PostMapping("/todos")
  //other methode to response status

    public ResponseEntity <Todo> createTodo(@RequestBody Todo newTodo){
        todosList.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }
}
