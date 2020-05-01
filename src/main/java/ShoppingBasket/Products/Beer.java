package ShoppingBasket.Products;

public class Beer extends Product {

    String name = "Tyskie       ";
    double price = 3.6;
    double vat = 0.23;

    public Beer(){};
    public Beer(String name, double price) {
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

