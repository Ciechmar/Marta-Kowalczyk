package ZadanieDomowe;

public abstract class Figure {
    int a;
    String color;
    String name;

    public Figure(int a, String color, String name) {
        this.a = a;
        this.color = color;
        this.name = name;
    }

    public abstract double figureField();
}