package com.backend.backend.services;

import com.backend.backend.entities.ToDo;
import com.backend.backend.repository.ToDoRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServices implements ToDoServicesInterface{

    @Autowired
    private ToDoRepositoryInterface data;

    @Override
    public Iterable<ToDo> list() {
        return data.findAll();
    }

    @Override
    public ToDo save(ToDo toDo) {
        return data.save(toDo);
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    @Override
    public ToDo update(ToDo toDo) {
        return data.save(toDo);
    }
}
