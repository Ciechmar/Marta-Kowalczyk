package enumy.zadanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static enumy.zadanie.ProductType.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @BeforeEach
    void setUp() {

        List <Product> listaOwoców;

    }

    @Test
    void retrieveFruitsCzyTworzyListę() {
        Product porzeczka = new Product("Porzeczka", 1.78, 0.5, OWOCE);
        Product szynka = new Product("Wędlina", 0.256, 0.1, MIESO );
        Product ogorek = new Product("Zielony", 5,0.1,WARZYWA);
        ProductService productService = new ProductService();
        List <Product> listaProduktów = new LinkedList<>();
        List <Product> listaOwocow = new LinkedList<>();
        listaProduktów.add(porzeczka);
        listaProduktów.add(szynka);
        listaProduktów.add(ogorek);
        listaOwocow = productService.retrieveFruits(listaProduktów);
        assertNotNull(listaOwocow);
        assertFalse(listaOwocow.isEmpty());

        assertEquals(listaOwocow.get(0).getProductType(), OWOCE);
    }

}