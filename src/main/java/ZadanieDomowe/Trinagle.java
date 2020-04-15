package ZadanieDomowe;

public class Trinagle extends Figure{
    int height;


    public Trinagle(int a, String color, String name, int height) {
        super(a, color, name);
        this.height = height;
    }

    @Override
    public double figureField() {
        return (a*height)/2;
    }
}
