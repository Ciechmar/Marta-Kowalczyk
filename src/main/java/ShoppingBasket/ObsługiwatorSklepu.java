package ShoppingBasket;

import ShoppingBasket.Fruits.Orange;
import ShoppingBasket.Products.Apple;
import ShoppingBasket.Products.Beer;
import ShoppingBasket.Products.Hoodie;

class ObsługiwatorSklepu {

    static void showMenu() {
        System.out.println("Witamy w sklepie :) \nWybierz produkty które chcesz dodać do koszyka");
        System.out.println("1. Jabłka 1kg\n2. Bluza\n3. Piwo\n4.Pomarańcze 1kg\n5. Koniec zakupów\n\n");
    }

    static void addApple(Check check) {
        check.productList.add(new Apple());
    }

    static void addBeer(Check check) {
        check.productList.add(new Beer());
    }

    static void addHoodie(Check check) {
        check.productList.add(new Hoodie());
    }

    static void addOrange(Check check) {
        check.productList.add(new Orange());
    }

    static void addChosenProductToList(String selecktedProduct, Check check) {
        char seleckted = selecktedProduct.charAt(0);
        switch (seleckted) {
            case '1': {
                addApple(check);
                break;
            }
            case '2': {
                addHoodie(check);
                break;
            }
            case '3': {
                addBeer(check);
                break;
            }
            case '4': {
                addOrange(check);
                break;
            }

            default:
                System.out.println("Nie ma takiego produktu");
        }

    }

}
