import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class TablicaLiczbUjemnych {
//    Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych.
//    Jeśli takie występująutwórz nową tablicę, do której przepisze tylko
//    te ujemne liczby

    public static void main(String[] args) {
        int[] tablica = new int[]{0,1,5, 6,3,-9,-4,1,-4};
        int[] tablicaUjemnych = new int[tablica.length-1];
        int ilośćUjemnych = 0;

        for (int i = 0; i <tablica.length-1 ; i++) {
            if (tablica[i]<0) {
                ilośćUjemnych++;
                tablicaUjemnych[ilośćUjemnych-1] = tablica[i];
            }
        }
        System.out.println("Ilosć ujemnych liczb to: " + ilośćUjemnych);
        System.out.println(Arrays.toString(tablicaUjemnych));

        System.out.println((Arrays.toString(policzUjemne(tablica))));


    }

    public static int[] policzUjemne (int[] tablica) {
        int[] tab = new int[0];
        for (int i : tablica) {
            if (i < 0) {
               tab = ArrayUtils.add(tab, i);
            }
        }
        return tab;
    }
}
