package com.example.taskmanagerbe.Entities;

import javax.persistence.*;

@Entity
public class Revista {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String denumire;
    private int an;

    public Revista(String denumire, int an, TipRevista tipRevista, String ISSN, String eISSN, float factorDeImpact) {
        this.denumire = denumire;
        this.an = an;
        this.tipRevista = tipRevista;
        this.ISSN = ISSN;
        this.eISSN = eISSN;
        this.factorDeImpact = factorDeImpact;
    }

    @ManyToOne
    private TipRevista tipRevista;
    private String ISSN;
    private String eISSN;

    private float factorDeImpact;

    public Revista() {
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
