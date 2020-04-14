package obiekty2;

public class Cat2 extends Animal2 {

    public Cat2(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Miau");
    }

    @Override
    public void move() {
        System.out.println("szur szur");
    }
}
