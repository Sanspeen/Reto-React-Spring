package co.com.sofka.demoSpring.React.mapper;

import co.com.sofka.demoSpring.React.entities.Todo;
import co.com.sofka.demoSpring.React.model.TodoDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface TodoMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idCategory", target = "idCategory"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "completed", target = "completed")
    })
    TodoDTO cambioDeDTOaTODO(Todo todo);

    Iterable<TodoDTO> listDtoTodo(Iterable<Todo> todo);

    @InheritInverseConfiguration
    Todo cambioDeTodoADTO(TodoDTO todoDTO);
}
