package ZadanieDomowe;

import static java.lang.StrictMath.pow;

public class Circle extends Figure {


    public Circle(int a, String color, String name) {
        super(a, color, name);

    }

    @Override
    public double figureField() {
        return Math.PI*pow(a,2);
    }
}
