package kurs.zajecia12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sklep sklep = new Sklep();

        ArrayList<Klient> klienci = sklep.stworzSklep();

        for (Klient k : klienci) {
            ArrayList<Faktura> faktury = k.getFaktury();
            double suma = sklep.sumaFaktur(faktury);

            System.out.println(suma);
        }

    }
}
