package com.backend.backend.repository;

import com.backend.backend.entities.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepositoryInterface extends CrudRepository <ToDo, Integer> {
}
