package co.com.sofka.demoSpring.React.controller;

import co.com.sofka.demoSpring.React.model.TaskListDTO;
import co.com.sofka.demoSpring.React.services.TaskListServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasklist")
@CrossOrigin(origins = "http://localhost:3000")

public class TaskListController {

    @Autowired
    TaskListServices services;

    @GetMapping(value = "/list")
    public Iterable<TaskListDTO> list(){
        return services.list();
    }

    @GetMapping(value = "/list/{id}")
    public TaskListDTO get(@PathVariable("id") Long id){
        return services.get(id);
    }

    @PostMapping(value = "/save")
    public TaskListDTO save(@RequestBody TaskListDTO taskListDTO){
        return services.save(taskListDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id")Long id){
        services.delete(id);
    }
}
