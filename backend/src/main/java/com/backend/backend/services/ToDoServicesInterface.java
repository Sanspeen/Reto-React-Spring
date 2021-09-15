package com.backend.backend.services;

import com.backend.backend.entities.ToDo;

import java.util.Optional;

public interface ToDoServicesInterface {
    public Iterable<ToDo> list();
    public ToDo save(ToDo toDo);
    public void delete(int id);
    public ToDo update(ToDo toDo);
}
