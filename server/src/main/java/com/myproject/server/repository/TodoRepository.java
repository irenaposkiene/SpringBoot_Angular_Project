package com.myproject.server.repository;


import com.myproject.server.model.Todo;
import org.springframework.data.repository.CrudRepository;

//it is important in order to send our quesries to our database

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
