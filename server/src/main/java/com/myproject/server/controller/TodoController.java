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
    public Todo createTodo(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @PutMapping("/todo")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @GetMapping("/oldtodos/{done}")
    public Todo findByDone(List<Todo> todos, Boolean done) {

        for (Todo todo : todos) {
            if (todo.getDone()== Boolean.TRUE) {
                return todo;
            }
        }
        return null;

    }


}

