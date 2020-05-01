package ShoppingBasket.Products;

public class Hoodie extends Product {

    String name = "BluzaDługiRękaw";
    double price = 98.0;
    double vat = 0.23;

    public Hoodie(){};
    public Hoodie(String name, double price) {
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

