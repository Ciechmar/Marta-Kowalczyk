package zadania;

//        Napisz funkcję tworzącą ciąg arytmetyczny o podanych:
//        długości, pierwszym elemencie, różnicy ciągu

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class Ciągi {

    public static void main(String[] args) {

//        List<Integer> lista = new ArrayList<>();
//        ArrayList <Integer> lista2 = new ArrayList<>();
//
//        lista.add(15);
//        lista.add(20);
//        lista.add(30);
//
//        System.out.println(lista);
//        lista.remove(0);
//        lista.add(444);
//        System.out.println(lista);
//
//        System.out.println(sumaLiczbZListy(8, 1, 2));
//        List <Integer> ciagi = new ArrayList<>();

        List<Integer> ciag = sumaLiczbZListy( 10,1,1);


    }

    public static List<Integer> sumaLiczbZListy (int długość, int pierwszy, int różnica){
        List <Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);
        for (int i = pierwszy; i <długość; i++) {
            ciag.add(pierwszy + i* różnica);
        }

        return ciag;
    }

//    public static boolean sprawdzCzyCiagArytmetyczny (List<Integer> ciag){
//        for (int i = 1; i < ciag.size() ; i++) {
//            if(ciag.get(i - 1) + ciag.get(i + 1)/2 != ciag.get(i)){
//                return false;
//            }
//            return true;
//        }
//    }

}
