package com.example.taskmanagerbe.Controllers;

import com.example.taskmanagerbe.Entities.Facultate;
import com.example.taskmanagerbe.Entities.Task;
import com.example.taskmanagerbe.Services.FacultateServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/facultate")
@CrossOrigin(origins = "*",allowedHeaders = "*")

public class FacultateController {
       private FacultateServices facultateServices;
    public FacultateController(FacultateServices facultateServices) {
        this.facultateServices = facultateServices;
    }

    @GetMapping("/all")
    public ArrayList<Facultate> getAllTasks(){
        return facultateServices.getAllFacultati();
    }

    @GetMapping("/testData")
    public ArrayList<Facultate> addtestData(){
        return facultateServices.addFacultati();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        facultateServices.deleteFacultateById(id);
    }

    @GetMapping("/{id}")
    public Facultate getFacultateById(@PathVariable int id){
        return facultateServices.getFacultateById(id);
    }
}
