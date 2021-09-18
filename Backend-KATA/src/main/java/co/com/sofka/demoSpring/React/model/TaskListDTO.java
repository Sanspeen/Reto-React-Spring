package co.com.sofka.demoSpring.React.model;

import java.util.List;

public class TaskListDTO {
    private Long id;
    private String listName;
    private List<TodoDTO> todos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<TodoDTO> getTasks() {
        return todos;
    }

    public void setTasks(List<TodoDTO> todos) {
        this.todos = todos;
    }
}
