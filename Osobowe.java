package zadaniaDomowe.wypożyczalnia;

public class Osobowe extends Pojazd{
    private final String typ = "osobowy";

    @Override
    public String getTyp() {
        return typ;
    }

    public Osobowe(String rejestracja, String vin, String kolor, double spalanie) {
        super(rejestracja, vin, kolor, spalanie);



    }


}
