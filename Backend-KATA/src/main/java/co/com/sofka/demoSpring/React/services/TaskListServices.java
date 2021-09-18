package co.com.sofka.demoSpring.React.services;
import co.com.sofka.demoSpring.React.model.TaskListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskListServices {
    @Autowired
    private InterfaceTaskListServices InterfaceTaskListServices;

    public Iterable<TaskListDTO> list(){
        return InterfaceTaskListServices.list();
    }
    public TaskListDTO save(TaskListDTO taskListDTO){
        return InterfaceTaskListServices.save(taskListDTO);
    }
    public void delete(Long id){
        InterfaceTaskListServices.delete(id);
    }
    public TaskListDTO get(Long id){
        return InterfaceTaskListServices.get(id);
    }
}
