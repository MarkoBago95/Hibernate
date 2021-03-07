package main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zaposleni")
public class Zaposleni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zaposleni_id")
    private int zaposleniId;

    @Column(name = "ime")
    private String ime;

    @Column(name = "godine")
    private int godine;

    @Column(name = "adresa")
    private String adresa;

    @Column(name = "dohodak")
    private double dohodak;

    public int getZaposleniId() {
        return zaposleniId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {

        this.godine = godine;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {

        this.adresa = adresa;
    }

    public double getDohodak() {

        return dohodak;
    }

    public void setDohodak(double dohodak) {
        this.dohodak = dohodak;
    }
    public Zaposleni(String ime,int godine,String adresa,double dohodak)
    {
        this.ime=ime;
        this.godine=godine;
        this.adresa=adresa;
        this.dohodak=dohodak;
    }
    public Zaposleni(){}
    @Override
    public String toString()
    {
        return "ID: "+this.zaposleniId+"\n"+" Ime: "+this.ime+"\n"+" Godine: "+this.godine+" Adresa: "+this.adresa+
                " Dohodak: "+this.dohodak+"\n\n";
    }
}
