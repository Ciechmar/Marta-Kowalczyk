package ZadanieDomowe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InneDoPrzecwiczenia {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj wysokość prostokąta a");
//        int a = scanner.nextInt();
//        System.out.println("Podaj długość b");
//        int b = scanner.nextInt();
//        rysujProstokat(a,b);
        int [] tablica = ciagArtmetyczny(2,10, 4);

        for (int i = 0; i < 9 ; i++) {
            System.out.println(tablica[i]);
        }
        System.out.println(" Twoja metoda działą: " + nowIHaveModulo(13,7));



    }
// Zad 1
    public static void rysujProstokat (int a, int b){
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < b ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// Zad 2
    public static int [] ciagArtmetyczny (int a1, int n, int r){
        int [] tablicaCiagu = new int [n];


            for (int i = 1; i < n ; i++) {
                System.out.println("(i-1)*r = " +((i - 1)*r) );

            tablicaCiagu [i - 1] = (a1 + (i - 1)*r);
        }
        return tablicaCiagu;
    }

//    Zad 3

    public static int modulo (int dzielona, int dzielnik){
        return dzielona - dzielnik * (dzielona/dzielnik);
    }

//    Zad 4

    public static boolean nowIHaveModulo (int dzielona, int dzielnik){

         if ((dzielona % dzielnik) == modulo(dzielona,dzielnik)) {
             System.out.println(dzielona % dzielnik + " vs " + modulo(dzielona,dzielnik));
         return true;
         } else return false;
    }
}
