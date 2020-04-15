package ZadanieDomowe;


import static java.lang.StrictMath.pow;

public class Objektowosc {
    public static void main(String[] args) {
        Odcinek odcinek = new Odcinek(2, 2, 4,5);
        double x = odcinek.x;
        double y= odcinek.y;
        double x2 = odcinek.x2;
        double y2 = odcinek. y2;

       double dlugosc = dlugoscODcinak(x,y,x2,y2);
        System.out.printf("Długość tego odcinka to: %.2f", dlugosc);

    }

    public static double dlugoscODcinak (double x, double y, double x2, double y2){
        double dlugosc;
        dlugosc = Math.sqrt(pow((x2-x),2)+ pow((y2-y),2));
        return dlugosc;
    }


}
