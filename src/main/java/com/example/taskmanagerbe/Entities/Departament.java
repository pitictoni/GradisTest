package com.example.taskmanagerbe.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departament {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String denumire;
    private int idFacultate;

    public Departament() {
    }
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getIdFacultate() {
        return idFacultate;
    }

    public void setIdFacultate(int idFacultate) {
        this.idFacultate = idFacultate;
    }

    public Departament(String denumire, int idFacultate) {
        this.denumire = denumire;
        this.idFacultate = idFacultate;
    }



}
