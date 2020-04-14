package obiekty2;

public class Vet2 {

    public void sayHello (Animal2 animal) {

        System.out.println("witaj " + animal.getName());
    }


    public static void main(String[] args) {

        Animal2 kot = new Cat2("Pako");
        Animal2 pies = new Dog2("Pieseł");
        Animal2 chomik = new Chomik("Karol");

        Vet2 vet2 = new Vet2();
        vet2.sayHello(kot);
        vet2.sayHello(pies);
        vet2.sayHello(chomik);


    }
}
