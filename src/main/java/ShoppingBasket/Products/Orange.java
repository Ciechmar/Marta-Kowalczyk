package ShoppingBasket.Fruits;

import ShoppingBasket.Products.Product;

public class Orange extends Product {

    String name = "PomarańczaNavelina";
    double price = 5;
    double vat = 0.08;

    public Orange(){};
    public Orange(String name, double price) {
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
