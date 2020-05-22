package zadaniaDomowe.kolekcje;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Dzialania {
    static void mawiecejNiz26Lat(List<Pracownik> lista) {

        for (Pracownik pracownik : lista) {
            if (pracownik.wiek >= 26) {
                System.out.println(pracownik.imie);
            }
        }
    }

    static void kobietaZeStazemPowyzej3Miesiecy(List<Pracownik> lista) {
        for (Pracownik pracownik : lista) {
            if (pracownik.plec == Plec.KOBIETA || pracownik.plec == Plec.NIEOKRESLONO) {
                if (pracownik.staz >= 3) {
                    System.out.println(pracownik.toString());
                }
            }
        }
    }

    static void andrzejZPensja30k(List<Pracownik> lista) {
        for (Pracownik pracownik : lista) {
            if (pracownik.imie.toLowerCase().equals("andrzej")) {
                if (pracownik.pensja >= 30000)
                    System.out.println(pracownik.toString());
            }
        }
    }

    static List<Pracownik> usunPRacownika(List<Pracownik> list, String imie) {
        Scanner scanner = new Scanner(System.in);
        int pozycjaNaLiscie = -1;
        for (Pracownik pracownik : list) {
            if (pracownik.imie.toLowerCase().equals(imie.toLowerCase())) {
                System.out.println("Czy chcesz usunąć tego pracownika? Y/N");
                System.out.println(pracownik.toString());
                String odpowiedz = scanner.next();
                scanner.nextLine();
                if (odpowiedz.toUpperCase().equals("Y")) {
                    pozycjaNaLiscie = list.indexOf(pracownik);
                }
            }
        }
        list.remove(pozycjaNaLiscie);
        return list;
    }

    static double sumaWszystkichPensji (List<Pracownik> lista){
        double sumaPensji = 0;
        for (Pracownik pracownik : lista) {
            sumaPensji = sumaPensji + pracownik.pensja;
        }
        return sumaPensji;
    }

    static  void wypiszMape (Map<Long, Double> daneDoWypłat){
        for (Long nrKont : daneDoWypłat.keySet()){
            System.out.printf("Nr konta %d, wylata: %.2f zł \n", nrKont, daneDoWypłat.get(nrKont));
        }
    }

    static void wypiszPensjePowyzej5k (Map<Long, Double> daneDoWyplat){
        System.out.println("Pensje powyżej 5k zł");
        for (Long nrKont : daneDoWyplat.keySet()){
            if (daneDoWyplat.get(nrKont)>= 5000) {
                System.out.printf("Nr konta %d, wylata: %.2f zł \n", nrKont, daneDoWyplat.get(nrKont));
            }
        }
    }


    static void dajPodwyzkeNajdluzszymStazemo10Procent (List <Pracownik> listaPracownikow) {
        for (Pracownik pracownik : listaPracownikow) {
            if (pracownik.staz >= 5) {
                pracownik.setPensja(pracownik.pensja + (0.1 * pracownik.pensja));
            }
        }
    }

    static void dajPodwyzkeKatarzynieNajdluzszymStazemo10Procent (List <Pracownik> listaPracownikow) {
        for (Pracownik pracownik : listaPracownikow) {
            if (pracownik.staz >= 5 && pracownik.imie.equals("Katarzyna")) {
                pracownik.setPensja(pracownik.pensja + (0.1 * pracownik.pensja));
            }
        }
    }
}
