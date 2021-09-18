package co.com.sofka.demoSpring.React.services;

import co.com.sofka.demoSpring.React.entities.Todo;
import co.com.sofka.demoSpring.React.mapper.TodoMapper;
import co.com.sofka.demoSpring.React.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Etiqueta que nos denomina a el servicio hacia el sistema.
public class TodoServices {

    @Autowired
    private ITodoRepository repository;


    @Autowired
    private TodoMapper taskListMapper;


    public Iterable<Todo> list(){
        return repository.findAll();

    }

    public Todo save(Todo todo){
        return repository.save(todo);
    }

    public Todo get(long id){
        return repository.findById(id).orElseThrow();
    }


    public void delete(long id){
        repository.delete(get(id));
    }

}
