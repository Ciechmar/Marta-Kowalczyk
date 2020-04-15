package ZadanieDomowe;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;

public class Odcinek extends Punkt {
    double x2;
    double y2;

    public Odcinek(double x, double y, double x2, double y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Odcinek(int x, int y) {
        super(x, y);
    }


    public static double dlugoscOdcinka(double x, double y, double x2, double y2){
        double dlugosc;
        dlugosc = Math.sqrt(pow((x2-x),2)+ pow((y2-y),2));
        return abs(dlugosc);
    }

    public static void rysujOdcinek (double dlugosc){
        int dlugoscInt = (int) dlugosc;
        System.out.print("|");
        for (int i = 0; i <dlugoscInt ; i++) {
            System.out.print("-");
        }
        System.out.print("|");

    }
}
