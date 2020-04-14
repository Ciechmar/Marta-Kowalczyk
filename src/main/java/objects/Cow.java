package objects;

public class Cow implements Animal {

    public void dajMleko () {
        System.out.println("Pij mleko -będziesz wielki");
    }

    @Override
    public void makeSound() {
        System.out.println("Muuu");
    }

    @Override
    public void move() {
        System.out.println("tup tup");
    }
}
