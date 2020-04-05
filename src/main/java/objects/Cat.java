package objects;

public class Cat implements Animal{

   private int mouseAmount = 0;

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
}
