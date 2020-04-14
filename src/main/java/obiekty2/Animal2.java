package obiekty2;

import objects.Movable;

public abstract class Animal2 implements Movable {

    private String name;

    public Animal2(String name) {
        this.name = name;
    }

    abstract void makeSound();

    public String getName() {
        return name;
    }
}
