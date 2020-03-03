package kurs.zajecia10;

import java.util.Scanner;

public class Main {
    public static void main(String[] arguments) {
        przyklad2();
    }

    public static void przyklad2() {
        Scanner scanner = new Scanner(System.in);
        Human czlowiek = new Human();

        System.out.println("Podaj imię twojego człowieka:");
        czlowiek.name = scanner.nextLine();
        System.out.println("Podaj wiek twojego człowieka:");
        czlowiek.age = scanner.nextInt();

        czlowiek.x = 0;
        czlowiek.y = 0;

        while (true) {
            System.out.println("Ile pójść do przodu X:");
            czlowiek.forwardX(scanner.nextInt());

            System.out.println("Ile pójść do przodu Y:");
            czlowiek.forwardY(scanner.nextInt());

            System.out.println("Ile pójść do tyłu X:");
            czlowiek.backX(scanner.nextInt());

            System.out.println("Ile pójść do tyłu Y:");
            czlowiek.backY(scanner.nextInt());

            System.out.print("Twoja aktualna pozycja to: ");
            czlowiek.position();

            System.out.println("Czy chcesz wyjsc? (tak/nie)");
            scanner.nextLine();
            String wyjscie = scanner.nextLine();

            if (wyjscie.equals("tak")) {
                System.out.println("Dzięki że byłeś z nami!");
                return;
            }
        }
    }

    public static void przyklad1() {
        Human czlowiek1 = new Human();
        czlowiek1.name = "Bartek";
        czlowiek1.age = 21;
        czlowiek1.hello();

        Human czlowiek2 = new Human("Krzysztof", 40,0,0);
        czlowiek2.hello();
        czlowiek2.forwardY(3);
        czlowiek2.position();
    }
}