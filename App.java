package zadaniaDomowe.wypożyczalnia;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Osobowe osobowe1 = new Osobowe("GD 1234", "WIN345fmki98ujhhy", "Czerwony", 5.8);
        Osobowe osobowe2 = new Osobowe("GD 3255", "WIN234567890oikjj", "Fioletowy", 5.3);
        Osobowe osobowe3 = new Osobowe("GD 1478", "WIN345lfk5kfogj5v", "Żółty", 4.8);
        Osobowe osobowe4 = new Osobowe("GD 9514", "WIN345f92j6k1l3d4", "Czerwony", 6.1);
        Osobowe osobowe5 = new Osobowe("GD 3578", "WINter64te64ys3d4", "Czarny", 5.2);
        Osobowe osobowe6 = new Osobowe("GD 8523", "WIN34j58fj49thdd4", "Czarny", 5.0);
        Osobowe osobowe7 = new Osobowe("GD 3258", "WIN345nfier94875j", "Czerwony", 4.5);
//        osobowe1.setStanZbiornikaPaliwa(25);
        List <Pojazd> osobowe = new ArrayList<>();
        osobowe.add(osobowe1);
        osobowe.add(osobowe2);
        osobowe.add(osobowe3);
        osobowe.add(osobowe4);
        osobowe.add(osobowe5);
        osobowe.add(osobowe6);
        osobowe.add(osobowe7);
//        Util util = new Util();
//        System.out.printf("Samochód o rejestracji : %s  ma %.1f l w baku i przejedzie : %.2f km", osobowe.getRejestracja(), osobowe.getStanZbiornikaPaliwa(),util.IleKilometrówPrzejedzie(osobowe));

        Wypożyczalnia wypożyczalnia = new Wypożyczalnia();
        wypożyczalnia.wypozycz(osobowe1,10);
        wypożyczalnia.wypozycz(osobowe1,10);



    }
}
