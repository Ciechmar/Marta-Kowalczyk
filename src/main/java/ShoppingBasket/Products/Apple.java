package ShoppingBasket.Products;

public class Apple extends Product {

    String name = "Jabłko     ";
    double price = 3.30;
    double vat = 0.05;

    public Apple(){};
    public Apple(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getVat() {
        return vat;
    }

    @Override
    public double getBruttoPrice() {
        return super.getBruttoPrice();
    }
}
