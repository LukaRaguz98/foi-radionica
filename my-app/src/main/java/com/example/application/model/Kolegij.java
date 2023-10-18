package com.example.application.model;

public class Kolegij {
    private String imeKolegija;
    private int ocjena;

    public Kolegij(String imeKolegija, int ocjena) {
        this.imeKolegija = imeKolegija;
        this.ocjena = ocjena;
    }

    public String getImeKolegija() {
        return imeKolegija;
    }

    public void setImeKolegija(String imeKolegija) {
        this.imeKolegija = imeKolegija;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }
}