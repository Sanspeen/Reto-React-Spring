package co.com.sofka.demoSpring.React.services;

import co.com.sofka.demoSpring.React.model.TaskListDTO;

public interface InterfaceTaskListServices {

    public Iterable<TaskListDTO> list();
    public TaskListDTO save(TaskListDTO taskListDTO);
    public void delete(Long id);
    public TaskListDTO get(Long id);

}
