package co.com.sofka.demoSpring.React.repository;

import co.com.sofka.demoSpring.React.entities.Todo;
import co.com.sofka.demoSpring.React.mapper.TodoMapper;
import co.com.sofka.demoSpring.React.model.TodoDTO;
import co.com.sofka.demoSpring.React.services.ITodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Todorepository implements ITodoServices {

    @Autowired
    private ITodoRepository data;

    @Autowired
    private TodoMapper mapper;

    @Override
    public Iterable<TodoDTO> list() {
        Iterable<Todo> todo = data.findAll();
        return mapper.listDtoTodo(todo);
    }

    @Override
    public TodoDTO save(TodoDTO todoDTO) {
        Todo todo = mapper.cambioDeTodoADTO(todoDTO);
        return mapper.cambioDeDTOaTODO(data.save(todo));
    }

    @Override
    public void delete(Long id) {
        data.delete(mapper.cambioDeTodoADTO(get(id)));
    }


    @Override
    public TodoDTO get(Long id) {
        Todo todo = data.findById(id).orElseThrow();
        return mapper.cambioDeDTOaTODO(todo);
    }
}
