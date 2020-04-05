package objects;

public class TestyNaKotach {
    public static void main(String[] args) {
        Cat pako = new Cat();
        pako.eatMouse();
        pako.eatMouse();
        pako.eatMouse();
        pako.eatMouse();
        pako.eatMouse();

        if (czyPowinienDostaćMleko(pako) == true) {
            System.out.println("Daj mleczko");
        }else System.out.println("Jeszcze kilka myszy");

    }

    public static  boolean czyPowinienDostaćMleko( Cat pako){

        if (pako.getMouseAmount() >10){
            return true;
        }
        return false;
    }
}
