package sample;

public class Artikal {
    private String sifra;
    private String naziv;
    private String cijena;

    public Artikal() {
    }

    public Artikal(String sifra, String naziv, String cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {

        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getCijena() {
        return cijena;
    }

    public void setCijena(String cijena) {
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
