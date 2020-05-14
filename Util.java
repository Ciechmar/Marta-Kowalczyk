package zadaniaDomowe.wypożyczalnia;

public class Util {
     double IleKilometrówPrzejedzie( Pojazd pojazd){
        return (100.0 * pojazd.getStanZbiornikaPaliwa())/pojazd.getSpalanie();
    }
}


