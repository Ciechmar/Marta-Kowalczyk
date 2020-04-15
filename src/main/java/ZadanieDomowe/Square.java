package ZadanieDomowe;

public class Square extends Figure{
    public Square(int a, String color, String name) {
        super(a, color, name);
    }

    @Override
    public double figureField() {
        return a*a;
    }
}
