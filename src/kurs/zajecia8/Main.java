package kurs.zajecia8;

public class Main {
    public static void main(String[] args) {
        przyklad1();
        int i = daj2();
        int j = 2;

        System.out.println(i);
        System.out.println(j);

        double bok = 2.5;
        double podstawa = 6.4;
        double poletrojkata1 = poletrojkata(podstawa, 2.7);

        double pole = poleProstokata(bok, 1.2);
        System.out.println(pole);


        boolean wynik = wiekszaNiz4(5);
        System.out.println(wynik);

        if (!wiekszaNiz4(3)) {
            System.out.println("Jest mniejsza niż 4");

        }
        String imieIwiek = imieIwiek("Bartek", 12);
        System.out.println(imieIwiek);
        System.out.println(poletrojkata1);
    }

    public static String imieIwiek(String imie, int wiek) {
        String wynik = "moje imie to " + imie + " moj wiek to " + wiek;
        return wynik;
    }

    public static boolean wiekszaNiz4(int liczba) {
        if (liczba > 4) {
            return true;
        }
        return false;
    }

    public static void przyklad1() {
        System.out.println("Hello!");
    }

    public static int daj2() {
        System.out.println("W metodzie daj 2!");
        return 2;
    }

    public static double poleProstokata(double alfa, double beta) {
        return alfa * beta;
    }
    public static double poletrojkata(double a, double h){
        return a * h /2;
    }
}
