package ZadanieDomowe;
// Zadania bez użycia zewnętrznych bibliotek i package typu java.util

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
//ToDo: 1) Tablica (suma z dwóch) bez powtarzających się elementów
//      2) Tablica (suma z dwóch) tylko nie powtórzone elementy.

    public int[] tableSumNoRepeat (int [] table1, int[] table2) {
        int end = table1.length;
        int[] table3 = new  int [end];
        int ilośćLiczbPojedynczych = end;

        for (int i = 0; i < table1.length ; i++) {
            for (int j = i + 1; j < table1.length; j++) {
                if (table1[i] != table1[j]) {
                    table3[j] = table1[i];
                    i++;

                }else {
                    ilośćLiczbPojedynczych--;


                }
            }
        }

        int [] table = new int [ilośćLiczbPojedynczych];
        for (int i = 0; i <table.length ; i++) {
            table[i] = table3[i];
        }

        return table;
    }




//    public int[]tableSumNoReapet (int[] table, int[] table2){
//        int [] table3 = new int [table.length + table2.length];
//        int czynnikX =0; /*ilość powtórek*/
//        int ilośćPowtórzeń = 0;
//        int elementTablicy = 0;
//
//        while (elementTablicy != (table.length+ table2.length)){
//            for (int element: table) {
//                for (int i = 0; i < table3.length ; i++) {
//                    if (element == table3[i]) {
//                        ilośćPowtórzeń++;
//
//                        System.out.println("No to mamy powtórkę: " + element);
//                        System.out.println("Mamy już powtóek: " + ilośćPowtórzeń);
//                    } else {
//                        table3[elementTablicy] = element;
//
//                    }
//                }
//                elementTablicy++;
//            }
//            for (int element2 : table2){
//                table3[elementTablicy] = element2;
//                elementTablicy++;
//            }
//        }

//        for (int i = 0; i < table.length ; i++) {
//            if (table3[i-czynnikX] != table[i]){
//            table3 [i-czynnikX] = table[i];
//            }else {
//                czynnikX++;
//                System.out.println("Ilość powtóek to : " + czynnikX);
//            }
//        }
//        for (int i = table.length; i <(table.length+table2.length) ; i++) {
//           table3[i] = table2[i-table2.length];
////        }
//        return table3;
//    }





    public int[] reverseTable (int[] table){
        int[] table2 = new int [table.length];
        for (int i = 0; i < table.length ; i++) {
            table2[table2.length-i-1] = table[i];
        }
        writeTable(table);
        System.out.println();
        writeTable(table2);
        System.out.println();
        return table2;

    }
/*
// Znalezione w necie:

    public  int[] removeDuplicates(int[] table) {

        int end = table.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (table[i] == table[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        table[shiftLeft] = table[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] table3 = new int[end];
        for(int i = 0; i < end; i++){
            table3[i] = table[i];
        }
        return table3;
    }

    public static int[] removeDuplicates1(int[] table){
        int end = table.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (table[i] == table[j]) {
                    table[j] = table[end-1];
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        System.arraycopy(table, 0, whitelist, 0, end);
        return whitelist;
    }

*/




}
