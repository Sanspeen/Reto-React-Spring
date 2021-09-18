package co.com.sofka.demoSpring.React.services;

import co.com.sofka.demoSpring.React.model.TodoDTO;

public interface ITodoServices {

    public Iterable<TodoDTO> list();
    public TodoDTO save(TodoDTO todoDTO);
    public void delete(Long id);
    public TodoDTO get(Long id);

}
