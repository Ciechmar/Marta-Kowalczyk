package zadania;
import java.util.Arrays;

public class Tablica {
    public static void main(String[] args) {
//        int [] tablica = new int[] {1,2,3};
//        for (int i = 0; i <=2 ; i++) {
//            System.out.println(tablica[i]);
//        }
//        zamienPierwszyITrzciElement(tablica);
//        System.out.println(Arrays.toString(tablica));


        int [] niePosortowanaTablica = new int[] {1,2,3,5,2,8,4,1,67,23};
        System.out.println(Arrays.toString(niePosortowanaTablica));
        Arrays.sort(niePosortowanaTablica);
        System.out.println(Arrays.toString(niePosortowanaTablica));
    }


    public static void zamienPierwszyITrzciElement (int[] tablica){
        int zmienna = tablica[0];
        tablica [0] = tablica [2];
        tablica[2 ] = zmienna;

    }


}
