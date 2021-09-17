package co.com.sofka.demoSpring.React.services;

import co.com.sofka.demoSpring.React.entities.Todo;
import co.com.sofka.demoSpring.React.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Etiqueta que nos denomina a el servicio hacia el sistema.
public class TodoService {

    @Autowired
    private TodoRepository repository; //Llamamos al repositorio.

    //Esta funcion lo que hará es que nos devolvera una lista iterada de los objetos que hayamos registrado en la base de datos
    public Iterable<Todo> list(){
        return repository.findAll(); //El metodo .findAll(); lo sacamos de el repositorio que tomo los metodos del Crud y este nos permite buscar a todos los elementos de la DB y retornarlos en la lista iterada.

    }

    //Este metodo nos permite guardar los datos del objeto en la base de datos recibiendo el objeto por parametro.
    public Todo save(Todo todo){
        return repository.save(todo); //El metodo save tambien es una herencia de CrudRepository desde repository.
    }

    //Valida que si obtenga el id antes de eliminarlo y si no lo obtiene arroja una excepcion.
    public Todo get(long id){
        return repository.findById(id).orElseThrow(); //El orElseThrow arroja la excepcion.
    }

    //Borra algun elemento de nuestra DB mediante la validacion del get.
    public void delete(long id){
        repository.delete(get(id)); //Toma el id desde el get(id) de la linea 26 para validar que este si exista y lo elimina si este existe.
    }

}
