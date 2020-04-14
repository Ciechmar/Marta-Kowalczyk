package objects;

public class Dog implements Animal{

    private String name;

    public Dog() {
        this.name = name;
    }
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void aport () {
        System.out.println("Biegnę po to!");
    }

    @Override
    public void makeSound() {
        System.out.println("Hau Hau!");
    }

    @Override
    public void move() {
        System.out.println("Biegnę");
    }
}
