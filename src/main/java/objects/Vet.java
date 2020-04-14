package objects;

public class Vet {

    public void sayHello (Cat cat) {
        System.out.println("Kici kici " + cat.getName());
    }

    public void sayHello (Dog dog) {
        System.out.println("Witaj " + dog.getName());
    }

    public static void main(String[] args) {
        Cat pako = new Cat("Pako");
        Dog piesel = new Dog("Pieseł");

        Vet weterynarz = new Vet();

        weterynarz.sayHello(pako);
        weterynarz.sayHello(piesel);
    }
}
