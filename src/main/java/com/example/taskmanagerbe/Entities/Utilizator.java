package com.example.taskmanagerbe.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilizator {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String mail;
    private int roleId;

    private int idDepartament;
    public Utilizator() {

    }
    public Utilizator(String mail, int roleId, int idDepartament) {
        this.mail = mail;
        this.roleId = roleId;
        this.idDepartament = idDepartament;
    }

    //region Setters/Getters

    public int getIdDepartament() {
        return idDepartament;
    }

    public void setIdDepartament(int idDepartament) {
        this.idDepartament = idDepartament;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    //endregion




}
