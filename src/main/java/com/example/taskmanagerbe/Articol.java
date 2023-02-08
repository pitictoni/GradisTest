package com.example.taskmanagerbe;

import javax.persistence.*;
import java.util.List;

@Entity
public class Articol {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String titlu;
    private int idRevista;
    private int numar;
    private int volum;

    @OneToMany
    private List<Autor> listaAutori;

    @OneToMany
    private List<Dovada> listaURLDovezi;
    private String linkDB;
    private String linkSite;
    private String DOI;
    private String WOS;
    private String pagini;

    private int autoriAfiliati;
    private int autoriULBS;
    private int totalAutori;
    private int punctajIndividual;

    public Articol() {
    }

    public Articol(String titlu, int idRevista, int numar, int volum, List<Autor> listaAutori, List<Dovada> listaURLDovezi, String linkDB, String linkSite, String DOI, String WOS, String pagini, int autoriAfiliati, int autoriULBS, int totalAutori, int punctajIndividual) {
        this.titlu = titlu;
        this.idRevista = idRevista;
        this.numar = numar;
        this.volum = volum;
        this.listaAutori = listaAutori;
        this.listaURLDovezi = listaURLDovezi;
        this.linkDB = linkDB;
        this.linkSite = linkSite;
        this.DOI = DOI;
        this.WOS = WOS;
        this.pagini = pagini;
        this.autoriAfiliati = autoriAfiliati;
        this.autoriULBS = autoriULBS;
        this.totalAutori = totalAutori;
        this.punctajIndividual = punctajIndividual;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getIdRevista() {
        return idRevista;
    }

    public void setIdRevista(int idRevista) {
        this.idRevista = idRevista;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public List<Autor> getListaAutori() {
        return listaAutori;
    }

    public void setListaAutori(List<Autor> listaAutori) {
        this.listaAutori = listaAutori;
    }

    public List<Dovada> getListaURLDovezi() {
        return listaURLDovezi;
    }

    public void setListaURLDovezi(List<Dovada> listaURLDovezi) {
        this.listaURLDovezi = listaURLDovezi;
    }

    public String getLinkDB() {
        return linkDB;
    }

    public void setLinkDB(String linkDB) {
        this.linkDB = linkDB;
    }

    public String getLinkSite() {
        return linkSite;
    }

    public void setLinkSite(String linkSite) {
        this.linkSite = linkSite;
    }

    public String getDOI() {
        return DOI;
    }

    public void setDOI(String DOI) {
        this.DOI = DOI;
    }

    public String getWOS() {
        return WOS;
    }

    public void setWOS(String WOS) {
        this.WOS = WOS;
    }

    public String getPagini() {
        return pagini;
    }

    public void setPagini(String pagini) {
        this.pagini = pagini;
    }

    public int getAutoriAfiliati() {
        return autoriAfiliati;
    }

    public void setAutoriAfiliati(int autoriAfiliati) {
        this.autoriAfiliati = autoriAfiliati;
    }

    public int getAutoriULBS() {
        return autoriULBS;
    }

    public void setAutoriULBS(int autoriULBS) {
        this.autoriULBS = autoriULBS;
    }

    public int getTotalAutori() {
        return totalAutori;
    }

    public void setTotalAutori(int totalAutori) {
        this.totalAutori = totalAutori;
    }

    public int getPunctajIndividual() {
        return punctajIndividual;
    }

    public void setPunctajIndividual(int punctajIndividual) {
        this.punctajIndividual = punctajIndividual;
    }
}
