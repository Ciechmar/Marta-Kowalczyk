package ShoppingBasket;

import ShoppingBasket.Products.Product;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class Check {

//    b) Stwórz klasę Rachunek, która będzie posiadała pole, które będzie przetrzymywała produkty (tablica/lista).
//    Klasa powinna posiadać instancyjną metodę pozwalającą na dodawanie produktów, a także metodę sumującą całą cenę na rachunku -
//    netto oraz brutto (to dwi różne metody).
//    Klasa powinna mieć takżę metodę pozwalającą zwrócić VAT czyli różnicę mięczy brtto i netto.


    List<Product> productList = new LinkedList<>();

    private List <Product> AddProduct (List<Product> productList, Product product){
        productList.add(product);
        return productList;
    }

    private double sumPrizeBrutto (List<Product> productList) {
        double sum = 0.0;
        for (int i = 0; i <productList.size() ; i++) {
            sum = sum + productList.get(i).getBruttoPrice();
        }
        return sum;
    }

    private double sumPrizeNetto (List<Product> productList) {
        double sum = 0.0;
        for (int i = 0; i <productList.size() ; i++) {
            sum = sum + productList.get(i).getPrice();
        }
        return sum;
    }

    private double giveVatBack (){
        return sumPrizeBrutto(productList)-sumPrizeNetto(productList);
    }

    public double getSumPrizeNetto (){
        return sumPrizeNetto(productList);
    }

    public double getSumPrizeBrutto(){
        return sumPrizeBrutto(productList);
    }

    public double getGiveBackVat (){
        return giveVatBack();
    }

    public void showFullCheck(Check check){

        System.out.println("Sklep U Mariolki\nul.Wichury 2/10\n81-415 Gdańsk");
        System.out.println(LocalDate.now()+"\n");

       for (Product product: productList){
           System.out.printf("%s     %.2f\n",product.getName().substring(0,10),product.getBruttoPrice());
       }

        System.out.printf("Razem: %.2f zł",check.getSumPrizeBrutto());
    }

}
