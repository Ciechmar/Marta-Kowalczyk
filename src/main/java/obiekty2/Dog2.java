package obiekty2;

public class Dog2 extends Animal2 {
    public Dog2(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Hau hau");
    }

    @Override
    public void move() {
        System.out.println("tup tup");

    }
}
