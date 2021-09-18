package co.com.sofka.demoSpring.React.controller;
import co.com.sofka.demoSpring.React.services.TodoService;
import co.com.sofka.demoSpring.React.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService service;


    @GetMapping(value = "api/todos")
    public Iterable<Todo> list(){
        return service.list();

    }

    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){
        return service.save(todo);
    }

    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId() != 0){
            return service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualizar.");
    }


    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") long id){
        return service.get(id);
    }


    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id") long id){
        service.delete(id);
    }

}
