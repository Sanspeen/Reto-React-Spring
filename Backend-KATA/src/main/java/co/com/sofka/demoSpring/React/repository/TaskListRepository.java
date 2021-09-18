package co.com.sofka.demoSpring.React.repository;

import co.com.sofka.demoSpring.React.entities.TaskList;
import co.com.sofka.demoSpring.React.mapper.TaskListMapper;
import co.com.sofka.demoSpring.React.model.TaskListDTO;
import co.com.sofka.demoSpring.React.services.InterfaceTaskListServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaskListRepository implements InterfaceTaskListServices {

    @Autowired
    private ITaskListRepository data;

    @Autowired
    private TaskListMapper taskListMapper;


    @Override
    public Iterable<TaskListDTO> list() {
        Iterable<TaskList> taskLists = data.findAll();
        return taskListMapper.taskListDTOS(taskLists);
    }

    @Override
    public TaskListDTO save(TaskListDTO taskListDTO) {
        TaskList taskList = taskListMapper.toTaskList(taskListDTO);
        return taskListMapper.changeTaskListDTO(data.save(taskList));
    }

    @Override
    public void delete(Long id) {
        data.delete(taskListMapper.toTaskList(get(id)));
    }

    @Override
    public TaskListDTO get(Long id) {
        TaskList taskList = data.findById(id).orElseThrow();
        return taskListMapper.changeTaskListDTO(taskList);
    }
}
