package ShoppingBasket;

import java.util.Scanner;

public class ShopinngBascket {
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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        String seleckted;
        ObsługiwatorSklepu.showMenu();
        do {
            seleckted = scanner.next();
            scanner.nextLine();
            if (seleckted.charAt(0) != '5'){
                System.out.println("Dodano produkt do koszyka");
                ObsługiwatorSklepu.addChosenProductToList(seleckted, check);}
            else System.out.println(" Dziękujemy za zakupy");
        } while (seleckted.charAt(0) != '5');
        check.showFullCheck(check);


    }
}
