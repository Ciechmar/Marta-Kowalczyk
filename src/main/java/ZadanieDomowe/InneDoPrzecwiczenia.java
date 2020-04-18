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

/*   Zad 5
    Stwórz koszyk z produktami. Bedzie on służył przechowywaniu zamówienia.
        a) Stwórz klase Produkt. Klasa powinna posiadac pola: Nazwa oraz cena. W klasie tej powinny być settery i gettery do wszystkich pól
        Powinna tutaj być także metoda cenaBrutto, któa przemnoży cenę netto na podatek VAT.
        Przyjmijmy, że zyjemy w prostym i przyjemnym podatkowo kraju i każdy produkt ma podatek VAT 8%.

        b) Stwórz klasę Rachunek, która będzie posiadała pole, które będzie przetrzymywała produkty (tablica/lista).
        Klasa powinna posiadać instancyjną metodę pozwalającą na dodawanie produktów, a także metodę sumującą całą cenę na rachunku -
        netto oraz brutto (to dwi różne metody).
        Klasa powinna mieć takżę metodę pozwalającą zwrócić VAT czyli różnicę mięczy brtto i netto.


 */



}
