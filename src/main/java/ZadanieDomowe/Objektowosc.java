package ZadanieDomowe;


import java.util.ArrayList;
import java.util.List;


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

        Circle circle = new Circle(5, "white", "koło");
        int r = circle.a;
        double d = circle.figureField();
        System.out.printf("Pole powierzchni %s kołą to %.2f\n\n" , circle.color , d);

        Trinagle trojkat = new Trinagle(5, "red","trojkat", 4);
        Square kwadrat = new Square(5, "yellow", "kwadrat");
        Rectangle prostokat = new Rectangle(4, "purple","prostokąt", 6);

        List<Figure> list = new ArrayList<>();
        list.add(kwadrat);
        list.add(circle);
        list.add(prostokat);
        list.add(trojkat);

        for (Figure figura : list) {

            System.out.printf("Pole %s %s wynosi %.1f\n",figura.color, figura.name, figura.figureField());
        }



    }


}
