package kurs.zajecia9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        przyklad4();
    }

    public static void przyklad4() {
        int godziny = 24;

        int min = minuty(4);

        System.out.println(   sekundy(  minuty(godziny)  )  );
    }

    public static int minuty(int godz) {
        return godz * 60;
    }

    public static int sekundy(int minuty) {
        return  minuty * 60;
    }

    public static void przyklad3() {
        int[] wejscie = {1,2,3,4,5, 123, 142, 15223532, 162};
        int[] wynik = odwrocLiczby(wejscie);
        wyswietl(wynik);
    }

    public static int[] odwrocLiczby(int[] liczby) {
        int[] wynik = new int[liczby.length];
        int indeks = 0;

        for (int i = wynik.length - 1; i >= 0; --i) {
            wynik[indeks] = liczby[i];
            indeks++;
        }

        return wynik;
    }

    public static void wyswietl(int[] liczby) {
        System.out.println("Tablica liczb:");

        for (int i = 0; i < liczby.length; i++) {
            if (i == liczby.length - 1) {
                System.out.println(liczby[i]);
            } else {
                System.out.print(liczby[i] + ", ");
            }
        }
    }

    public static void przyklad2() {
        String[] liczby = { "78978921", "134125673", "6782677" };
        String wynik = najwiecejSiodemek(liczby);

        System.out.println("Najwiecej siodemek jest w: " + wynik);
    }

    public static String najwiecejSiodemek(String[] liczby) {
        int[] siodemki = new int[liczby.length];

        for (int i = 0; i < liczby.length; i++) {
            siodemki[i] = liczZnaki(liczby[i], '7');
        }

        int max = 0;
        int indeks = 0;

        for (int i=0; i < siodemki.length; i++) {
            if (max < siodemki[i]) {
                max = siodemki[i];
                indeks = i;
            }
        }

        return liczby[indeks];
    }

    public static void przyklad1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zdanie:");
        String zdanie = scanner.nextLine();
        System.out.println("Podaj znak:");
        char znak = scanner.nextLine().charAt(0);

        int wynik = liczZnaki(zdanie, znak);

        System.out.println("Liczba wystapien znaku " + znak + " w zdaniu to: " + wynik);
    }

    public static int liczZnaki(String tekst, char znak) {
        int suma = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                ++suma;
            }
        }

        return suma;
    }
}
