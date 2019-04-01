package sample;

import java.util.ArrayList;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal() {
    }

    public Artikal(String ulaz) {
        String[] lista = ulaz.split(",");

        setSifra(lista[0]);
        setNaziv(lista[1]);
        setCijena(Double.parseDouble(lista[2]));
    }

    public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> lista) {
        for (int i=0; i < lista.size(); i++) {
            for (int j=i+1; j < lista.size(); j++) {
                if(lista.get(i).equals(lista.get(j)))
                    lista.remove(j);
            }
        }

        return lista;
    }

    @Override
    public boolean equals(Object obj) {
        Artikal a = (Artikal) obj;
        return getNaziv().equals(a.getNaziv()) && getSifra().equals(a.getSifra()) && getCijena()==a.getCijena();
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        if(sifra.isEmpty() || sifra==null) throw new IllegalArgumentException("Nije unesena sifra!");
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
