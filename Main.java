package enumy.zadanie;

import java.util.LinkedList;
import java.util.List;

import static enumy.zadanie.ProductType.*;

public class Main {
    public static void main(String[] args) {
        for (ProductType typy : ProductType.values()) {
            System.out.println(typy);
        }

        Product jablko = new Product("Jabłoko", 3.78, 1, OWOCE);
        Product jablko2 = new Product("Jabłoko", 3.90, 1, OWOCE);
        Product jablko3 = new Product("Arbuz", 6.78, 1, OWOCE);
        Product jablko4 = new Product("Jabłoko", 5.78, 2, OWOCE);
        Product jablko5 = new Product("Mandarynka", 9.78, 4, OWOCE);
        Product jablko6 = new Product("Porzeczka", 1.78, 0.5, OWOCE);
        Product szynka = new Product("Wędlina", 0.256, 0.1, MIESO );
        Product szynka1 = new Product("Wędlina", 0.156, 0.1, MIESO );
        Product szynka2 = new Product("Wędlina", 0.366, 0.1, MIESO );
        Product ogorek = new Product("Zielony", 5,0.1,WARZYWA);
        List<Product> listaProduktów = new LinkedList<>();
        listaProduktów.add(jablko);
        listaProduktów.add(szynka);
        listaProduktów.add(szynka1);
        listaProduktów.add(szynka2);
        listaProduktów.add(ogorek);
        listaProduktów.add(jablko2);
        listaProduktów.add(jablko3);
        listaProduktów.add(jablko4);
        listaProduktów.add(jablko5);
        listaProduktów.add(jablko6);

        ProductService productService = new ProductService();
        List<Product> listaowocow;
        listaowocow = productService.retrieveFruits(listaProduktów);

        for (Product owoce : listaowocow) {
            System.out.println(owoce.getName());
        }

    }
}
