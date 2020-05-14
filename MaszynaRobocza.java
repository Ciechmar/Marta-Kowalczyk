package zadaniaDomowe.wypożyczalnia;

public class MaszynaRobocza extends Pojazd {
    private final String typ = "Maszyna Robocza";

    @Override
    public String getTyp() {
        return typ;
    }

    public MaszynaRobocza(String rejestracja, String vin, String kolor, double spalanie) {
        super(rejestracja, vin, kolor, spalanie);
    }
}
