package ZadanieDomowe;

public class Rectangle extends Figure {
    int bokB;

    public Rectangle(int a, String color, String name, int bokB) {
        super(a, color, name);
        this.bokB = bokB;
    }

    @Override
    public double figureField() {
        return a*bokB;
    }
}
