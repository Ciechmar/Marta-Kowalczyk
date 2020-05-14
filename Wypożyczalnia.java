package zadaniaDomowe.wypożyczalnia;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Wypożyczalnia {

    void wypozycz(Pojazd pojazd, int ilośćDni) {
        if (pojazd.isCzyWypożyczony() == false) {
            pojazd.setCzyWypożyczony(true);
            pojazd.setDataWypozyczenia(LocalDate.now());
            pojazd.setIloscDniWypozyczenia(ilośćDni);
        } else
            System.out.println("Pojazd o rejestracji: " + pojazd.getRejestracja() + " jest już wypożyczony do: " + doKiedy(pojazd));
    }


    LocalDate doKiedy(Pojazd pojazd) {
        return pojazd.getDataWypozyczenia().plusDays(pojazd.getIloscDniWypozyczenia());
    }

    void wyszukaj(List<Pojazd> pojazdy) {
        System.out.println("Wyszukaj po: ");
        System.out.println("1. Cenie");
        System.out.println("2. Spalaniu");
        System.out.println("3. Typie pojazdu");
        Scanner scanner = new Scanner(System.in);
        String wyborWyszukania = scanner.next();


        switch (wyborWyszukania) {
            case "1": {
                System.out.println("W jakiej cenie szukasz ? (+- 200zł");
                int cena = scanner.nextInt();
                for (int i = (cena - 200); i <= (cena + 200); i++) {
                    for (Pojazd pojazd : pojazdy) {
                        if (pojazd.getCena() == i) {
                            System.out.println(pojazd.toString());
                        }
                        ;
                    }
                }
                break;
            }

            case "2": {
                System.out.println("Jakie spalanie Cię interesuje (+/- 0.2l)");
                double spalanie = scanner.nextDouble();
                double imin = spalanie*10 -2;
                double imax = spalanie*10+2;
                for (double i = imin; i <= imax; i++){
                    for (Pojazd pojazd : pojazdy) {
                        if (pojazd.getSpalanie()*10 == i) {
                            System.out.println(pojazd.toString());
                        }
                        else pojazd.toString();

                    }
                }
                break;
            }

            case "3": {
                System.out.println("Jaki rodzaj pojazdu Cię interesuje?");
                System.out.println("1. Osobowy");
                System.out.println("2. Dostawczy");
                System.out.println("3. Motor");
                System.out.println("4. Maszyna robocza");
                int typ = scanner.nextInt();

                switch (typ) {
                    case 1: {
                        for (Pojazd pojazd : pojazdy) {
                            if (pojazd.getTyp().equals("osobowy"))
                                System.out.println(pojazd.toString());
                        }
                        break;
                    }

                    case 2: {
                        for (Pojazd pojazd : pojazdy) {
                            if (pojazd.getTyp().equals("dostawczy"))
                                System.out.println(pojazd.toString());
                        }
                        break;
                    }

                    case 3: {
                        for (Pojazd pojazd : pojazdy) {
                            if (pojazd.getTyp().equals("motor"))
                                System.out.println(pojazd.toString());
                        }
                        break;
                    }

                    case 4: {
                        for (Pojazd pojazd : pojazdy) {
                            if (pojazd.getTyp().equals("Maszyna Robocza"))
                                System.out.println(pojazd.toString());
                        }
                        break;
                    }
                }

            }
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }

    }
}
