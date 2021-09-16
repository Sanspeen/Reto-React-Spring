package co.com.sofka.demoSpring.React;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //La etiqueta @RestController nos ayuda a definirle a spring boot cual es el archivo del controller con la estructura REST.
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService service; //Importa el servicio para poder usar los metodos que el tiene prestablecidos y hacer mas facil su aplicacion.

    //Esta funcion lo que hará es que nos devolvera una lista iterada de los objetos que hayamos registrado en la base de datos.
    @GetMapping(value = "api/todos") //Nos permite determinar el Endpoint donde se va a ejecutar nuestra funcion.
    public Iterable<Todo> list(){
        return service.list(); //Este metodo list es el que tenemos en TodoService y nos retornara la lista de objetos de la DB.

    }

    //Este metodo nos permite guardar los datos del objeto en la base de datos recibiendo el objeto por parametro.
    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){ //El @RequestBody nos permite enviar la peticion para crear un objeto con un cuerpo hacia adentro de la base de datos.
        return service.save(todo); //El metodo save viene de la clase TodoService.
    }

    //Permite actualizar un objeto de la DB.
    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){ //El @RequestBody nos permite enviar la peticion para crear un objeto con un cuerpo hacia adentro de la base de datos.
        if(todo.getId() != 0){
            return service.save(todo); //El metodo save viene de la clase TodoService (El save sobrescribe si esta sobre la misma ID).
        }
        throw new RuntimeException("No existe el id para actualizar."); //Lanza el error si no existe su id.
    }

    //Valida que si obtenga el id antes de eliminarlo y si no lo obtiene arroja una excepcion / Tambien nos devuelve un objeto que hayamos creado con esa id.
    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") long id){ //El @PathVariable nos permite obtener el dato que indicamos en el End Point
        return service.get(id); //El metodo get viene de la clase TodoService
    }

    //Borra algun elemento de nuestra DB mediante la validacion del get.
    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id") long id){
        service.delete(id); ////El metodo delete viene de la clase TodoService
    }

}
