package kurs.zajecia10;

public class Human {
    public String name;
    public int age;
    public int x;
    public int y;

    public Human() {}

    public Human(String name, int age, int x, int y) {
        this.name = name;
        this.age = age;

        this.x = x;
        this.y = y;
    }

    public void forwardX(int distance) {
        this.x += distance;
    }
    public void backX(int distance) {
        this.x -= distance;
    }
    public void forwardY(int distance) {
        this.y += distance;
    }
    public void backY(int distance) {
        this.y -= distance;
    }

    public void position() {
        System.out.println("X: " + this.x + "; Y: " + this.y);
    }

    public void hello() {
        System.out.println("Moje imie to: " + this.name+ ", a mój wiek to: " + this.age);
    }
}
