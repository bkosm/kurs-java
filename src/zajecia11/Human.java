package kurs.zajecia11;

public class Human {
    private String name;
    private int age;

    public Human() { }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hello() {
        System.out.println("I: "+name+", W: "+age+", do emerytury: "+retireIn());
    }
    public int retireIn() {
        return 65 - this.age;
    }

    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("Niemożliwe!");
            return;
        }

        this.age = age;
    }
}
