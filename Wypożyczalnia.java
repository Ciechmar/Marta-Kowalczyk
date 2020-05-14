package zadaniaDomowe.wypożyczalnia;

import java.time.LocalDate;

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
}
