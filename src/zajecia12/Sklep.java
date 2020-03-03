package zajecia12;

import java.util.ArrayList;

public class Sklep {
    public ArrayList<Klient> stworzSklep() {
        ArrayList<Klient> klienci = new ArrayList<>();

        Produkt p1 = new Produkt("Mleko", 1.99);
        Produkt p2 = new Produkt("Jajka", 2.49);
        Produkt p3 = new Produkt("Masło", 4.99);
        Produkt p4 = new Produkt("Chleb", 3.15);

        ArrayList<Produkt> lista1 = new ArrayList<>();
        lista1.add(p1);
        lista1.add(p2);

        ArrayList<Produkt> lista2 = new ArrayList<>();
        lista2.add(p3);
        lista2.add(p4);

        ArrayList<Produkt> lista3 = new ArrayList<>();
        lista3.add(p1);
        lista3.add(p3);
        lista3.add(p4);

        Faktura f1 = new Faktura("1/2020", lista2);
        Faktura f2 = new Faktura("2/2020", lista1);
        Faktura f3 = new Faktura("3/2020", lista3);

        ArrayList<Faktura> faktury1 = new ArrayList<>();
        faktury1.add(f1);
        faktury1.add(f2);

        ArrayList<Faktura> faktury2 = new ArrayList<>();
        faktury2.add(f1);
        faktury2.add(f2);
        faktury2.add(f3);

        Klient k1 = new Klient("Andrzej", faktury1);
        Klient k2 = new Klient("Krzysztof", faktury2);

        klienci.add(k1);
        klienci.add(k2);

        return klienci;
    }

    public double sumaFaktur(ArrayList<Faktura> faktury) {
        double suma = 0;

        for (Faktura f : faktury) {
            ArrayList<Produkt> p = f.getProdukty();
            for (Produkt produkt : p) {
                suma += produkt.getCena();
            }
        }

        return suma;
    }
}
