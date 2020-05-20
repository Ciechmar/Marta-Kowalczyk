package zadaniaDomowe.enumy;

import static zadaniaDomowe.enumy.Liczby.JEDEN;

public class AppEnum {
    public static void main(String[] args) {
        System.out.println("Jeden: ");
        System.out.println(wyswietlLiczbeEnuma(JEDEN));

       for (Liczby liczba:Liczby.values()){
           System.out.println(liczba);
       }

    }

    private static int wyswietlLiczbeEnuma(Liczby liczba) {
        switch (liczba) {
            case JEDEN:
                return 1;
            case DWA:
                return 2;
            case TRZY:
                return 3;
            case CZTERY:
                return 4;
            default:
                return 0;
        }
    }
}
