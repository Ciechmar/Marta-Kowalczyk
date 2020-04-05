package zadania;

public class TabliczkaMnozenia {
    private final int liczba;


    public TabliczkaMnozenia(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczke(){
        System.out.printf("Tabliczka dla liczby %d to:\n", liczba);

        for (int i = 1; i <= liczba ; i++) {
            System.out.printf("%d x %d = %d\n",liczba , i , liczba*i );
        }
    }
}
