package com.example.taskmanagerbe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Revista {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String denumire;
    private int an;

    private int idClasificare; // enum?

    private String ISSN;
    private String eISSN;

    private float factorDeImpact;

    public Revista() {
    }

    public Revista(String denumire, int an, int idClasificare, String ISSN, String eISSN, float factorDeImpact) {
        this.denumire = denumire;
        this.an = an;
        this.idClasificare = idClasificare;
        this.ISSN = ISSN;
        this.eISSN = eISSN;
        this.factorDeImpact = factorDeImpact;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getIdClasificare() {
        return idClasificare;
    }

    public void setIdClasificare(int idClasificare) {
        this.idClasificare = idClasificare;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public String geteISSN() {
        return eISSN;
    }

    public void seteISSN(String eISSN) {
        this.eISSN = eISSN;
    }

    public float getFactorDeImpact() {
        return factorDeImpact;
    }

    public void setFactorDeImpact(float factorDeImpact) {
        this.factorDeImpact = factorDeImpact;
    }
}
