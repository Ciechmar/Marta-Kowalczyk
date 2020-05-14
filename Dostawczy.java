package zadaniaDomowe.wypożyczalnia;

public class Dostawczy extends Pojazd {
    private final String typ = "dostawczy";

    @Override
    public String getTyp() {
        return typ;
    }

    public Dostawczy(String rejestracja, String vin, String kolor, double spalanie) {
        super(rejestracja, vin, kolor, spalanie);
    }
}
