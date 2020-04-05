package zadania;

public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        program.tabliczkaMnozenia(15);

        TabliczkaMnozenia tm = new TabliczkaMnozenia(5);
        System.out.println(tm.getLiczba());
        tm.wypiszTabliczke();
        tm = new TabliczkaMnozenia(20);
        tm.wypiszTabliczke();





    }


    public static int sumaliczb (int x, int y) {
        int suma = 0;
        for (int i = x; i < y ; i++) {
           suma = suma + i;
        }
        return suma;
    }


    public void tabliczkaMnozenia (int a){
        System.out.printf("Tabliczka dla liczby %d to:\n", a);

        for (int i = 1; i <= a ; i++) {
            System.out.printf("%d x %d = %d\n",a , i , a*i );
        }
    }

}
