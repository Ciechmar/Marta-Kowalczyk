package enumy.zadanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static enumy.zadanie.ProductType.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    private Product porzeczka;
    private Product arbuz;
    private Product jablo;
    private Product szynka;
    private Product ogorek;
    private ProductService productService;
    private List <Product> listaProduktów;
    private List <Product> listaOwocow;

    @BeforeEach
    void setUp() {

        porzeczka = new Product("Porzeczka", 1.78, 0.5, OWOCE);
        arbuz = new Product("Arbuz", 1.78, 0.5, OWOCE);
        jablo = new Product("jablko", 1.78, 0.5, OWOCE);
        szynka = new Product("Wędlina", 0.256, 0.1, MIESO );
        ogorek = new Product("Zielony", 5,0.1,WARZYWA);
        productService = new ProductService();
        listaProduktów = new LinkedList<>();
        listaOwocow = new LinkedList<>();
        listaProduktów.add(szynka);
        listaProduktów.add(arbuz);
        listaProduktów.add(porzeczka);
        listaProduktów.add(ogorek);
        listaProduktów.add(jablo);
        listaOwocow = productService.retrieveFruits(listaProduktów);

    }

// Czy można robić kilka testów w jednym?
    @Test
    void retrieveFruitsCzyTworzyListę() {
//        Oba testy sprawdzaja w zasadzie to samo.
        assertNotNull(listaOwocow);
        assertFalse(listaOwocow.isEmpty());
    }

    @Test
    void retrieveFruitCzyTworzyListęSamychOwoców(){
        assertEquals(listaOwocow.get(0).getProductType(), OWOCE);
        assertEquals(listaOwocow.get(1).getProductType(), OWOCE);
    }

}