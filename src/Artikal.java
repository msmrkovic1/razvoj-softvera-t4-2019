package sample;

import java.util.ArrayList;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal() {
    }

    public Artikal(String podaci) {
        String[] lista = podaci.split(",");
        this.sifra = lista[0];
        this.naziv = lista[1];
        this.cijena = Double.parseDouble(lista[2]);
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        if(sifra.isEmpty()) throw new IllegalArgumentException("Nije unesena sifra!");
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if(naziv.isEmpty()) throw new IllegalArgumentException("Prazan naziv!");
        this.naziv = naziv;
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        if(cijena<=0) throw new IllegalArgumentException("Cijena mora biti veca od 0");
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return sifra + "," + naziv + "," + cijena;
    }
}
