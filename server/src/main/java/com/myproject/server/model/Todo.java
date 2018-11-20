package com.myproject.server.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity need to map this class to database
@Entity

public class Todo {
//primary key @Id and generated value
    @Id
    @GeneratedValue
    private long id;
    private String value;
    private Boolean done = Boolean.FALSE;



    public Todo() {
    }


    public Todo(String value) {
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
    public Boolean getDone() {
        return done;
    }
}
