package zadaniaDomowe.kolekcje;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RejestPracowników {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Katarzyna", 45, 12500, 13, Plec.KOBIETA, 1210000000225451852L);
        Pracownik pracownik2 = new Pracownik("Katarzyna", 30, 5500, 4, Plec.KOBIETA, 1220000000224531852L);
        Pracownik pracownik3 = new Pracownik("Tomasz", 29, 4500, 4, Plec.MEZCZYZNA, 1230000000225451852L);
        Pracownik pracownik4 = new Pracownik("Serio", 26, 1500, 4, Plec.NIEOKRESLONO, 1240000456525451852L);
        Pracownik pracownik5 = new Pracownik("Pako", 33, 2500, 7, Plec.MEZCZYZNA, 1250000000225451852L);
        Pracownik pracownik6 = new Pracownik("Lu", 21, 1500, 1, Plec.KOBIETA, 1260000000125451852L);
        Pracownik pracownik7 = new Pracownik("Lu", 22, 1500, 1, Plec.MEZCZYZNA, 1270087860225451852L);
        Pracownik pracownik8 = new Pracownik("Andrzej", 29, 30001, 1, Plec.MEZCZYZNA, 1280087860225451852L);
        Pracownik pracownik9 = new Pracownik("Andrzej", 22, 1500, 1, Plec.MEZCZYZNA, 1209087860225451852L);

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(pracownik3);
        listaPracownikow.add(pracownik4);
        listaPracownikow.add(pracownik5);
        listaPracownikow.add(pracownik6);
        listaPracownikow.add(pracownik7);
        listaPracownikow.add(pracownik8);
        listaPracownikow.add(pracownik9);

        Dzialania dzialania = new Dzialania();
        System.out.println("Pracownicy powyżej 26 lat:");
        dzialania.mawiecejNiz26Lat(listaPracownikow);
        System.out.println("Kobiety z długim stażem:");
        dzialania.kobietaZeStazemPowyzej3Miesiecy(listaPracownikow);
        System.out.println("Andrzej z pensją 30k:");
        dzialania.andrzejZPensja30k(listaPracownikow);
//        System.out.println("Wywalamy pracownika:");
//        listaPracownikow = dzialania.usunPRacownika(listaPracownikow, "Lu");
//        for (Pracownik pracownik : listaPracownikow) {
//            System.out.println(pracownik.toString());
//        }
        System.out.println("Suam pensji pracowników:");
        System.out.println(dzialania.sumaWszystkichPensji(listaPracownikow) + " zł");

        Map<Long, Double> dandeDoWyplat = new HashMap<>();
        dandeDoWyplat.put(pracownik1.nrKonta, pracownik1.pensja);
        dandeDoWyplat.put(pracownik2.nrKonta, pracownik2.pensja);
        dandeDoWyplat.put(pracownik3.nrKonta, pracownik3.pensja);
        dandeDoWyplat.put(pracownik4.nrKonta, pracownik4.pensja);
        dandeDoWyplat.put(pracownik5.nrKonta, pracownik5.pensja);
        dandeDoWyplat.put(pracownik6.nrKonta, pracownik6.pensja);
        dandeDoWyplat.put(pracownik7.nrKonta, pracownik7.pensja);
        dandeDoWyplat.put(pracownik8.nrKonta, pracownik8.pensja);
        dandeDoWyplat.put(pracownik9.nrKonta, pracownik9.pensja);

        dzialania.wypiszMape(dandeDoWyplat);
        dzialania.wypiszPensjePowyzej5k(dandeDoWyplat);

        System.out.println("Przed podwyżką");
        for (Pracownik pracownik : listaPracownikow) {
            System.out.println(pracownik.imie + " : " + pracownik.pensja);
        }
        dzialania.dajPodwyzkeNajdluzszymStazemo10Procent(listaPracownikow);

        System.out.println("Po podwyżką");
        for (Pracownik pracownik : listaPracownikow) {
            System.out.println(pracownik.imie + " : " + pracownik.pensja);
        }

        dzialania.dajPodwyzkeKatarzynieNajdluzszymStazemo10Procent(listaPracownikow);

        System.out.println("Podwyżka dla Katarzyny");
        for (Pracownik pracownik : listaPracownikow) {
            System.out.println(pracownik.imie + " : " + pracownik.pensja);
        }



    }
}





