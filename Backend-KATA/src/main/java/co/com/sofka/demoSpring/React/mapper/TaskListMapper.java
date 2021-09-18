package co.com.sofka.demoSpring.React.mapper;

import co.com.sofka.demoSpring.React.entities.TaskList;
import co.com.sofka.demoSpring.React.model.TaskListDTO;
import co.com.sofka.demoSpring.React.model.TodoDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {TodoDTO.class})
public interface TaskListMapper {
    @Mappings({
            @Mapping(source = "listId", target = "id"),
            @Mapping(source = "listName", target = "listName"),
            @Mapping(source = "tasks", target = "tasks")
    })
    TaskListDTO changeTaskListDTO(TaskList taskList);

    Iterable<TaskListDTO> taskListDTOS(Iterable<TaskList> taskList);

    @InheritInverseConfiguration
    TaskList toTaskList(TaskListDTO taskListDTO);
}
