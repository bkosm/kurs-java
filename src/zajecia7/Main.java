package kurs.zajecia7;

import java.util.Scanner;
import kurs.zajecia8.Test;

/* Następne zajęcia dopiero 11 stycznia! */
public class Main {
    public static void main(String[] args) {
        //przyklad1();
        //przyklad2();
        zaddom();
    }

    public static void przyklad1() {
        String napis = "Warszawa";

        int maks = 0;
        for (int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);
            int wartosc = (int) znak;

            if (wartosc > maks) maks = wartosc;
        }

        System.out.println("Największa wartość: " + maks + ", a odpowiadający znak to: " + (char) maks);
    }

    public static void przyklad2() {
        String[] input = {
                "dom;kotek;mleko",
                "pies;kosci;malpa",
                "komputer;laptop;klawiatura"};

        String[] output = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            String[] slowa = input[i].split(";");

            String min = slowa[0];
            for (int j = 1; j < slowa.length; j++) {
                if (min.length() > slowa[j].length()) {
                    min = slowa[j];
                }
            }

            output[i] = min;
        }

        for (String tekst : output) {
            System.out.println("Najkrótszy wyraz w linii to: " + tekst);
        }
    }

    public static void zaddom() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wprowadź słowo: ");
        String input = scan.nextLine();

        System.out.println("Wprowadź znak do policzenia: ");
        char sign = scan.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (sign == input.charAt(i)) count++;
        }

        System.out.println("Ilość znaków '" + sign + "' w słowie '" + input + "': " + count);
    }
}