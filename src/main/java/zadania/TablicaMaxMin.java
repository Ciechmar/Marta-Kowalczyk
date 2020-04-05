package zadania;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class TablicaMaxMin {
    public static void main(String[] args) {
        int[] tablica = new int[]{1, 2, 3, 6, 8, 3, 23, 68, 98, 12, 45, 67, 34};

        Arrays.sort(tablica);
        System.out.println("Wartośc min: " + tablica[0]);
        System.out.println("Wartość max: " + tablica[tablica.length - 1]);

        System.out.println(NumberUtils.max(tablica));
        System.out.println(NumberUtils.min(tablica));

    }
}
