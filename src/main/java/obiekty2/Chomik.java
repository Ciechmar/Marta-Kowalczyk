package obiekty2;

public class Chomik extends Animal2 {
    public Chomik(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("pii");
    }

    @Override
    public void move() {
        System.out.println(" tuptam");

    }
}
