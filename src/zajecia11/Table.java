package zajecia11;

public class Table {
    private int ilOsob;

    public Table(int ilosc) {
        ilOsob = ilosc;
    }

    private int ileWody() {
        return this.ilOsob + 1;
    }

    public void info() {
        System.out.println("L: "+ilOsob+", w: "+ileWody());
    }
}
