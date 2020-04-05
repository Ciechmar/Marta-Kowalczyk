package objects;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Animal tablicaAnimali[] = new Animal[5];
        List<Animal> listaAnimali = new ArrayList<>();

        tablicaAnimali[0] = new Cat();
        tablicaAnimali[1] = new Cat();
        tablicaAnimali[2] = new Dog();
        tablicaAnimali[3] = new Cat();
        tablicaAnimali[4] = new Cow();


        listaAnimali.add(new Cat());
        listaAnimali.add(new Cat());
        listaAnimali.add(new Dog());
        listaAnimali.add(new Cow());
        listaAnimali.add(new Cow());
        listaAnimali.add(new Cow());
        listaAnimali.add(new Dog());


        dajGlosDlaListy(listaAnimali);
        dajGlosDlaTablicy(tablicaAnimali);


    }

    public static void dajGlosDlaTablicy(Animal[] zwierzat){
        for (Animal animal : zwierzat){
            animal.makeSound();
        }
    }

    public static void dajGlosDlaListy(List<Animal> zwierzat){
        for (Animal animal : zwierzat){
            animal.makeSound();
        }
    }

}
