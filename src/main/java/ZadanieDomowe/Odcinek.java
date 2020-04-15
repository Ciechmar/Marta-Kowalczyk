package ZadanieDomowe;

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
}
