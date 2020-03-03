package zajecia6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //przyklad1();
        //przyklad2();
        //przyklad3();
        zaddom();
    }

    public static void przyklad1() {
        Scanner read = null;
        try {
            read = new Scanner(System.in);
            System.out.println("Wprowadź imię: ");
            String imie = read.nextLine();
            System.out.println("Imię: " + imie);
        } finally {
            if (read != null) {
                read.close();
            }
        }
    }

    public static void przyklad2() {
        Scanner read = null;
        try {
            read = new Scanner(System.in);

            System.out.println("Ile liczb chcesz wprowadzić?");
            int ilosc = read.nextInt();

            System.out.println("Wprowadź liczby enterem: ");

            int[] liczby = new int[ilosc];
            for (int i = 0; i < liczby.length; i++) {
                liczby[i] = read.nextInt();
            }

            int suma = 0;
            for (int i = 0; i < liczby.length; i++) {
                suma += liczby[i];
            }

            System.out.println("Suma podanych liczb wynosi: " + suma);

        } finally {
            if (read != null) {
                read.close();
            }
        }
    }

    public static void przyklad3() {
        Scanner read = null;

        try {
            read = new Scanner(System.in);
        } catch (Exception e) {
            return;
        }

        while (true) {
            System.out.println("Wprowadź numer wykonywanej operacji: ");
            System.out.println("1 - Wyświetl od końca 3 wprowadzone liczby");
            System.out.println("2 - Znajdź najmniejszą z trzech wprowadzonych liczb");
            System.out.println("3 - Zamknij program");

            int wybor = read.nextInt();

            switch (wybor) {
                case 1: {
                    int[] tablica = {0, 0, 0};

                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("Teraz wprowadź liczbę: ");
                        tablica[i] = read.nextInt();
                    }

                    for (int i = tablica.length - 1; i >= 0; i--) {
                        System.out.print(tablica[i] + " ");
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    int[] tablica = {0, 0, 0};

                    for (int i = 0; i < tablica.length; i++) {
                        System.out.println("Teraz wprowadź liczbę: ");
                        tablica[i] = read.nextInt();
                    }

                    int najmniejsza = Integer.MAX_VALUE;
                    for (int i = 0; i < tablica.length; i++) {
                        if (tablica[i] < najmniejsza) {
                            najmniejsza = tablica[i];
                        }
                    }

                    System.out.println("Najmniejsza liczba jest równa " + najmniejsza);
                    break;
                }
                case 3: {
                    System.out.println("Dzięki za używanie.");
                    return;
                }

                default: {
                    System.out.println("Wybór jest niepoprawny.");
                }
            }
        }
    }

    public static void zaddom() {
        Scanner read = new Scanner(System.in);
        int[] tab = new int[2];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = read.nextInt();
        }


    }
}