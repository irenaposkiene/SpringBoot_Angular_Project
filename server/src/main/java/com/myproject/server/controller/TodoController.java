package com.myproject.server.controller;


import com.myproject.server.model.Todo;
import com.myproject.server.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//methods which will be requested from angular client
@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return (List<Todo>) todoRepository.findAll();
    }

    @GetMapping("/todo/{id}")
    public Optional<Todo> getTodo(@PathVariable Long id){
        return todoRepository.findById(id);
    }
    @PostMapping("/todo")
    public Todo addTodo(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    /*
    @DeleteMapping("/todo/{id}")
        public boolean deleteTodo(@PathVariable Long id){
            todoRepository.delete(id);
            return true;
        }
     */
    @PostMapping("/todo")
    public Todo createTodo(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @PutMapping("/todo")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }
}

