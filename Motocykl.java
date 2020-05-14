package zadaniaDomowe.wypożyczalnia;

public class Motocykl extends Pojazd{
    private final String typ = "motor";

    @Override
    public String getTyp() {
        return typ;
    }

    public Motocykl(String rejestracja, String vin, String kolor, double spalanie) {
        super(rejestracja, vin, kolor, spalanie);
    }
}
