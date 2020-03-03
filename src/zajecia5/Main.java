package zajecia5;

public class Main {

    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
    }

    public static void zadanie1() {
        int[] numTab = {1, 2, 7, 7, 6, 9, 5, 3, 2, 7};

        for (int i = 0; i < numTab.length; i++) {
            if (7 == numTab[i] || 5 == numTab[i]) {
                numTab[i] = 0;
            } else if (6 == numTab[i]) {
                numTab[i] = 8;
            }
        }

        for (int i = 0; i < numTab.length; i++) {
            System.out.print(numTab[i] + " ");
        }
    }

    /*
        5 % 2 = 1
        12 % 2 = 0
     */

    public static void zadanie2() {
        int[] numTab = {1, 2, 7, 7, 6, 9, 5, 3, 2, 7};
        int parzyste = 0;
        int nieparzyste = 0;

        for (int i = 0; i < numTab.length; i++) {
            if (numTab[i] % 2 == 0) {
                parzyste++;
            } else {
                nieparzyste++;
            }
        }

        System.out.println("Ilość liczb nieparzystych: " + nieparzyste);
        System.out.println("Ilość liczb parzystych: " + parzyste);
    }

    public static void zadanie3() {
        int[] numTab = {1, 2, 3, 4};
        String[] textTab = {"mal", "jag", "gru", "jab"};
        String[] wynikTab = new String[numTab.length];
        String[] wynikTabOdw = new String[numTab.length];

        for (int i = 0; i < numTab.length; i++) {
            wynikTab[i] = textTab[i] + numTab[i];
        }

        int odwrIndex = numTab.length - 1;
        for (int i = 0; i < numTab.length; i++) {
            wynikTabOdw[i] = textTab[odwrIndex] + numTab[i];
            odwrIndex--;
        }


        System.out.println("Tablica normalnie:");
        for (int i = 0; i < wynikTab.length; i++) {
            System.out.println(wynikTab[i] + " ");
        }

        System.out.println("Tablica odwrócona:");
        for (int i = 0; i < wynikTabOdw.length; i++) {
            System.out.println(wynikTabOdw[i] + " ");
        }
    }

    /*
        5, 4            -> new tab[2]
        [], []          -> new tab[2][3]
        |   |
        5   4
        3   2   -> tab[1][1]
        1   1
     */

    public static void zadanie4() {
        int[][] tab = new int[2][3];
        tab[0][0] = 0;
        tab[0][1] = 0;
        tab[0][2] = 1;

        tab[1][0] = 0;
        tab[1][1] = 0;
        tab[1][2] = 1;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
