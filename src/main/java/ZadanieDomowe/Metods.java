package ZadanieDomowe;


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

    public String[] nameChange (String[] table){
        table[0] = "piotr";
        writeTable(table);
        return table;
    }



}
