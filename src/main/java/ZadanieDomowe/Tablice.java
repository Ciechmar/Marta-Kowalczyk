package ZadanieDomowe;


public class Tablice {
    public static void main(String[] args) {
        int[] table  = {6, 3, 5, 7, 1, 1, 7, 9};
        int [] table2 = new int[table.length];
        int tableSize = table.length;
        for (int i = 0; i <tableSize ; i++) {
            table2[i] = i+1;
        }
        String[] tableString = {"mateusz", "kasia", "adam", "tomek", "andrzej"};

        Metods metods = new Metods();
        metods.average(table);
        System.out.println("Maksymalna wartość to: "+ metods.max(table));
        System.out.println("Minimalna wartość to: "+ metods.min(table));
        metods.sum(table, table2);
        metods.multiplication(table, table2);
        metods.writeTable(tableString);
        metods.nameChange(tableString);
        metods.changeFirstLetter(tableString);
//        metods.usunElement() <-- Nie da rady usunąć komórki,
//                              a jedynie zmienić jej zawartośc na pustą,
//                              ale tablica nadal ma wyjściową ilośc elementów.

        int[][]table3 = metods.tableSum(table,table2);
        metods.writeTable(table3);
//        int[]table4 = metods.tableSumNoReapet(table,table2);
//        metods.writeTable(table4);
        metods.reverseTable(table);










    }

}