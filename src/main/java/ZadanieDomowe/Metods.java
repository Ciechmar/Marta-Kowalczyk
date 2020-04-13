package ZadanieDomowe;


import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

public class Metods {
    public void average (int[] table){
        int suma = 0;
        for (int i = 0; i < table.length ; i++) {
            suma = suma + table[i];

        }
        double averageFloat = 39.00/8;
        System.out.println(table.length);
        System.out.println(suma);
        System.out.printf("średnia w tablicy to: %.2f \n" , (float)suma/table.length);
    }

    public int max (int[] table){
        int max = 0;
        for (int i = 0; i < table.length ; i++) {
            if (max < table[i]) {
                max = table[i];
            }
        }
        return max;
    }

    public int min (int[] table){
        int min = 0;
        for (int i = 0; i < table.length ; i++) {
            if (min > table[i]) {
                min = table[i];
            }
        }
        return min;
    }

    public void sum (int[] table, int[] table2){
        System.out.println("Wynik dodawania tablic: ");
        for (int i = 0; i < table.length ; i++) {

            System.out.printf("%d . %d \n",(i+1),(table[i] + table2[i]));
        }
    }


    public void multiplication (int[] table, int[] table2){
        System.out.println("Wynik mnożenia tablic:");

        for (int i = 0; i < table.length ; i++) {

            System.out.printf("%d . %d \n",(i+1),(table[i] * table2[i]));
        }
    }

    public void writeTable(Object[] table){
        for (int i = 0; i <table.length ; i++) {
            System.out.println((i+1) + ". " + table[i]);
        }
        System.out.println("Rozmiar tablicy to: " + table.length);
    }
    public void writeTable(int[] table){
        System.out.print("[ ");
        for (int i = 0; i <table.length ; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.print("]");
    }

    public void writeTable(int[][]table){
        for (int i = 0; i <table.length ; i++) {
            for (int j = 0; j <= 1 ; j++) {
                System.out.print("  " + table[i][j] + "  | ");
            }
            System.out.println();
        }
        System.out.println("Rozmiar tablicy to: " + table.length);
    }


    public String[] nameChange (String[] table){
        table[0] = "piotr";
        writeTable(table);
        return table;
    }

    public void changeFirstLetter (String[] table){
        for (int i = 0; i < table.length ; i++) {
            char firstLetter = table[i].toUpperCase().charAt(0);
            System.out.println( firstLetter + table[i].substring(1));
        }
    }

    public int[][]tableSum (int[] table, int[] table2){
        int[][]table3 = new int [table.length][2];
        for (int i = 0; i < table.length ; i++) {
            table3[i][0] = table[i];
            table3[i][1] = table2[i];
        }

       return table3;
    }
//ToDo:
    public int[]tableSumNoReapet (int[] table, int[] table2){
// Metoda wpisuje tylko nie powtórzone elementy do tablicy.

        int [] table3 = new int [table.length];
        



        return table3;
    }

    public int[] reverseTable (int[] table){
        int[] table2 = new int [table.length];
        for (int i = 0; i < table.length ; i++) {
            table2[table2.length-i-1] = table[i];
        }
        writeTable(table);
        System.out.println();
        writeTable(table2);
        return table2;

    }



}
