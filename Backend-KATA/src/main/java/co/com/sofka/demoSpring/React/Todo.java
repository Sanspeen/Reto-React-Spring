package co.com.sofka.demoSpring.React;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Entidad
@Table(name = "tasks") //Creara la tabla o insertara en ella.

public class Todo {  //Clase que almacenará la entidad To Do

    @Id //Determina la variable Id como un identificador.
    @GeneratedValue //Genera el valor para el ID automaticamente en caso tal de que no se lo den.
    private long id; //El ID será el valor identificador de este objeto.
    private String name; //Variable para el nombre de la tarea.
    private boolean isCompleted = false; //Este booleano va a determinar si ya se hizo la terea o si aun no.

    //Getters y Setters para acceder a la informacion de este objeto.
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
