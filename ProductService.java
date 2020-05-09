package enumy.zadanie;

import java.util.LinkedList;
import java.util.List;

public class ProductService {
    public List<Product> retrieveFruits(List<Product> product) {
        List<Product> listaOwoców = new LinkedList<>();
        for (Product produkty : product) {
            if (produkty.getProductType() == ProductType.OWOCE){
                listaOwoców.add(produkty);
            }
        }
        return listaOwoców;
    }
}
