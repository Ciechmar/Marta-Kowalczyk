package ShoppingBasket.Products;

public class Product {

//    a) Stwórz klase Produkt. Klasa powinna posiadac pola: Nazwa oraz cena. W klasie tej powinny być settery i gettery do wszystkich pól
//    Powinna tutaj być także metoda cenaBrutto, któa przemnoży cenę netto na podatek VAT.
//    Przyjmijmy, że zyjemy w prostym i przyjemnym podatkowo kraju i każdy produkt ma podatek VAT 8%.

   private String name;
    private double price;
    private double vat;

    private double bruttoPrice() {
// Cena brutto = cena netto x (1+ stawka podatku VAT), u nas VAT 8%.
        return (getPrice() * (1 + getVat()));
    }


    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getVat() {
        return this.vat;
    }

    public double getBruttoPrice() {
        return bruttoPrice();
    }
}
