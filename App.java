package zadaniaDomowe.wypożyczalnia;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Osobowe osobowe1 = new Osobowe("GD 1234", "WIN345fmki98ujhhy", "Czerwony", 5.8);
        Osobowe osobowe2 = new Osobowe("GD 3255", "WIN234567890oikjj", "Fioletowy", 5.3);
        Osobowe osobowe3 = new Osobowe("GD 1478", "WIN345lfk5kfogj5v", "Żółty", 4.8);
        Osobowe osobowe4 = new Osobowe("GD 9514", "WIN345f92j6k1l3d4", "Czerwony", 6.1);
        Osobowe osobowe5 = new Osobowe("GD 3578", "WINter64te64ys3d4", "Czarny", 5.1);
        Osobowe osobowe6 = new Osobowe("GD 8523", "WIN34j58fj49thdd4", "Czarny", 5.0);
        Osobowe osobowe7 = new Osobowe("GD 3258", "WIN345nfier94875j", "Czerwony", 4.5);

        Motocykl motor1 = new Motocykl ("GD 8765", "WINivn39frnd9oen", "Niebieski", 3.3);
        Motocykl motor2 = new Motocykl ("GD 8457", "WINiv3456yuthgfn", "Czarny", 3.0);
        Motocykl motor3 = new Motocykl ("GD 8766", "WINivn3mkjuy7643", "Brązowy", 2.3);



        //        osobowe1.setStanZbiornikaPaliwa(25);
        List <Pojazd> pojazds = new ArrayList<>();
        pojazds.add(osobowe1);
        pojazds.add(osobowe2);
        pojazds.add(osobowe3);
        pojazds.add(osobowe4);
        pojazds.add(osobowe5);
        pojazds.add(osobowe6);
        pojazds.add(osobowe7);
        pojazds.add(motor1);
        pojazds.add(motor2);
        pojazds.add(motor3);
//        Util util = new Util();
//        System.out.printf("Samochód o rejestracji : %s  ma %.1f l w baku i przejedzie : %.2f km", pojazds.getRejestracja(), pojazds.getStanZbiornikaPaliwa(),util.IleKilometrówPrzejedzie(pojazds));

        Wypożyczalnia wypożyczalnia = new Wypożyczalnia();
        wypożyczalnia.wypozycz(osobowe1,10);
        wypożyczalnia.wypozycz(osobowe1,10);

        System.out.println(osobowe1.getTyp());

        wypożyczalnia.wyszukaj(pojazds);




    }
}
