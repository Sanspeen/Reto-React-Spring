package co.com.sofka.demoSpring.React.repository;

import co.com.sofka.demoSpring.React.entities.Todo;
import org.springframework.data.repository.CrudRepository;
/*Dentro de esta interface podemos heredar todo lo que nos brinda CrudRepository que en resumen nos pide el nombre del objeto y el
tipo de identificador que tiene este objeto para poder aplicar todas las funcionalidades de un crud.*/
public interface ITodoRepository extends CrudRepository <Todo, Long>{
}
