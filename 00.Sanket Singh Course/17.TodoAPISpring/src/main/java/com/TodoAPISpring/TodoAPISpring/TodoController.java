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
        todosList.add(new Todo(1,2,"Todo 2",true));
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


    @GetMapping("/todos/{todoId}")
    public ResponseEntity<?> getTodoById(@PathVariable Long todoId){
        for(Todo todo :todosList){
            if(todo.getId()== todoId){
                return ResponseEntity.ok(todo);
            }
        }
        // If not found, return JSON error response with status code 404
        ApiErrorResponse errorResponse = new ApiErrorResponse(404, "Todo with ID " + todoId + " not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}
