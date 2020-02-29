package kurs.zajecia11;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Bartosz", 21);
        h1.hello();

        h1.setAge(119);
        h1.hello();

        Table test = new Table(5);
        test.info();
    }
}
