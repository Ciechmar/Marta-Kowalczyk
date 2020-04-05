package objects;

public class Cat implements Animal{

    public void drap() {
        System.out.println("Drap drap");
    }

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
