package ZadanieDomowe;


import static java.lang.StrictMath.*;

public class Objektowosc {
    public static void main(String[] args) {
        Odcinek odcinek = new Odcinek(10, 6, 4,5);
        double x = odcinek.x;
        double y= odcinek.y;
        double x2 = odcinek.x2;
        double y2 = odcinek. y2;

       double dlugosc = odcinek.dlugoscOdcinka(x,y,x2,y2);
        System.out.printf("Długość tego odcinka to: %.2f\n", dlugosc);
        odcinek.rysujOdcinek(dlugosc);

    }


}
