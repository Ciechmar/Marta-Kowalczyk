package objects;

public class Dog implements Animal{

    public void aport () {
        System.out.println("Biegnę po to!");
    }

    @Override
    public void makeSound() {
        System.out.println("Hau Hau!");
    }
}
