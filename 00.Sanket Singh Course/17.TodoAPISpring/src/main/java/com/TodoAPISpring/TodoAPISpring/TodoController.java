package com.TodoAPISpring.TodoAPISpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//versioning of the apis
@RestController
@RequestMapping("/api/v1/todos") //Mapping automaticaly..
public class TodoController {


    @Autowired
    private ApiErrorResponse apiErrorResponse; //Composition.

    private TodoService todoService;


    private static List<Todo> todosList;

//    Constructor.
    public TodoController(TodoService todoService){
        todosList = new ArrayList<>();
        todosList.add(new Todo(1,1L,"Todo 1",false));
        todosList.add(new Todo(1,2L,"Todo 2",true));
        this.todoService = todoService;
    }


    @GetMapping
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



    @PostMapping
  //other methode to response status

    public ResponseEntity <Todo> createTodo(@RequestBody Todo newTodo){
        todosList.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
    }


    @GetMapping("/{todoId}")
    public ResponseEntity<?> getTodoById(@PathVariable Long todoId){
        for(Todo todo :todosList){
            if(todo.getId()== todoId){
                return ResponseEntity.ok(todo);
            }
        }
        /*// If not found, return JSON error response with status code 404
          no need to create obj manually ..

        ApiErrorResponse errorResponse = new ApiErrorResponse(404, "Todo with ID " + todoId + " not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);*/

        apiErrorResponse.setStatusCode(404);
        apiErrorResponse.setStatusMessage( "Todo with ID " + todoId + " not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiErrorResponse);
    }


    //Delet Request
    @DeleteMapping("{todoId}")
    public ResponseEntity<?> deleteTodoById(@PathVariable Long todoId) {
        for (Todo todo : todosList) {
            if (todo.getId().equals(todoId)) {  // Use .equals() for Long comparison
                todosList.remove(todo);  // Remove the object, not by index
               /* ApiErrorResponse successResponse = new ApiErrorResponse(200, "Todo with ID " + todoId + " deleted successfully");
                return ResponseEntity.status(HttpStatus.OK).body(successResponse);*/
            }
        }
        // If not found, return a 404 error response

        apiErrorResponse.setStatusCode(404);
        apiErrorResponse.setStatusMessage( "Todo with ID " + todoId + " not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiErrorResponse);
       /* ApiErrorResponse errorResponse = new ApiErrorResponse(404, "Todo with ID " + todoId + " not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);*/
    }

    //Update Request
    @PutMapping("{todoId}")
    public ResponseEntity<?>  updateTodoById(@PathVariable  Long todoId,@RequestBody Todo newTodo){
        for(Todo todo:todosList){
            if(todo.getId().equals(todoId)){
                todosList.add(newTodo);
                apiErrorResponse.setStatusMessage("Todo with ID " + todoId + " Updated successfully");
                apiErrorResponse.setStatusCode(200);
                    return ResponseEntity.status(HttpStatus.OK).body(apiErrorResponse);
            }
        }


        apiErrorResponse.setStatusCode(404);
        apiErrorResponse.setStatusMessage( "Todo with ID " + todoId + " not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiErrorResponse);
        /*ApiErrorResponse errorResponse = new ApiErrorResponse(404, "Todo with ID " + todoId + " not found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);*/
    }
}
