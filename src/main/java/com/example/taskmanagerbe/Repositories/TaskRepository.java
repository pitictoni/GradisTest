package com.example.taskmanagerbe.Repositories;

import com.example.taskmanagerbe.Entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}