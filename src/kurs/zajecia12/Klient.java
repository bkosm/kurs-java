package kurs.zajecia12;

import java.util.ArrayList;

public class Klient {
    private String nazwa;
    private ArrayList<Faktura> faktury;

    public Klient(String nazwa, ArrayList<Faktura> faktury) {
        this.nazwa = nazwa;
        this.faktury = faktury;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public ArrayList<Faktura> getFaktury() {
        return faktury;
    }

    public void setFaktury(ArrayList<Faktura> faktury) {
        this.faktury = faktury;
    }
}
