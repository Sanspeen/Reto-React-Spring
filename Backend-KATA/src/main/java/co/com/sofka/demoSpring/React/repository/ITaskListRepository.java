package co.com.sofka.demoSpring.React.repository;

import co.com.sofka.demoSpring.React.entities.TaskList;
import co.com.sofka.demoSpring.React.entities.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskListRepository extends CrudRepository<TaskList, Long> {
}
