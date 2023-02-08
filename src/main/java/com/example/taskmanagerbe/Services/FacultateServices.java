package com.example.taskmanagerbe.Services;

import com.example.taskmanagerbe.Entities.Facultate;
import com.example.taskmanagerbe.Entities.Task;
import com.example.taskmanagerbe.Repositories.FacultateRepository;
import com.example.taskmanagerbe.Repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultateServices {

    private FacultateRepository facultateRepository;

    public FacultateServices(FacultateRepository facultateRepository) {
        this.facultateRepository = facultateRepository;
    }

    public ArrayList<Facultate> getAllFacultati() {
        return (ArrayList<Facultate>) facultateRepository.findAll();
    }

    public ArrayList<Facultate> addFacultati(){
        List<Facultate> mockFacultati = new ArrayList<>();

        mockFacultati.add(new Facultate("Inginerie") );
        mockFacultati.add(new Facultate("Litere") );
        mockFacultati.add(new Facultate("Medicina") );
        mockFacultati.add(new Facultate("Economice") );

        return (ArrayList<Facultate>) facultateRepository.saveAll(mockFacultati);
    }

    public void deleteFacultateById(int id) {
        facultateRepository.deleteById(id);
    }

    public Facultate getFacultateById(int id) {
        return facultateRepository.findById(id).get();
    }
}
