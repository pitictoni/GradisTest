package com.example.taskmanagerbe.Repositories;

import com.example.taskmanagerbe.Entities.Facultate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultateRepository extends CrudRepository<Facultate,Integer> {

}
