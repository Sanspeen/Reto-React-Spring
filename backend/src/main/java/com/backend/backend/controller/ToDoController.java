package com.backend.backend.controller;

import com.backend.backend.entities.ToDo;
import com.backend.backend.services.ToDoServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ToDoController {
    @Autowired
    private ToDoServicesInterface service;

    @GetMapping(value = "/list")
    public Iterable<ToDo> list(){
        try {
            return service.list();

        }catch (Error e){
            return (Iterable<ToDo>) e;
        }
    }

    @PostMapping(value = "/save")
    public ToDo saveUser(@RequestBody ToDo toDo){
        return service.save(toDo);
    }

    @PostMapping(value = "/update")
    public ToDo updateToDo(@RequestBody ToDo toDo){
        return service.update(toDo);
    }

    //Eliminar por ID
    @DeleteMapping(path = "/{id}")
    public void deleteByID(@PathVariable("id") int id){
        service.delete(id);
    }
}
