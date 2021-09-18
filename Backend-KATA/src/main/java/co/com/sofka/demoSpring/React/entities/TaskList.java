package co.com.sofka.demoSpring.React.entities;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "tasklist")
public class TaskList {

    private long id;
    private String Title;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long listId;
    private String listName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "listId")
    private List<Todo> todos;

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<Todo> getTasks() {
        return todos;
    }

    public void setTasks(List<Todo> todos) {
        this.todos = todos;
    }
}
