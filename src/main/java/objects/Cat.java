package objects;

public class Cat implements Animal{

    private static int licznikKotow = 0;
    private int mouseAmount = 0;
    private String name;

    public Cat () {   /*Wywołanie konstruktora w konstruktorze */
        this("Kot o ID" + licznikKotow);
        licznikKotow++;
    }
    public Cat(String name) {
        this.name = name;
    }

    public static Cat stworzKota(String name) {

        Cat kot = new Cat((name));
        return kot;
    }

    public String getName() {
        return name;
    }


    public void drap() {
        System.out.println("Drap drap");
    }


    public void eatMouse(){
        mouseAmount++;
        System.out.printf("Zajdłęm %d myszą\n", mouseAmount);
    }

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    public int getMouseAmount() {
        return mouseAmount*3;
    }

    @Override
    public void move() {
        System.out.println("szur szur");
    }


}
