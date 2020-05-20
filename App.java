package zadaniaDomowe.kolekcje;

import java.util.*;

/*
1.Utwórz listę liczb całkowitych: 1,2,2,2,4,5,13,3,2,1,1,18,37,31.1.
Wypisz listę razem z pozycją zajmowaną na liście
1.2.Posortuj listę i wypisz elementy znajdujące się w liście.
1.3.Znajdź największy i najmniejszy element listy
1.4.Sprawdź rozmiar listy i go wypisz
1.5.Utwórz zbiór(Set) liczb całkowitych i dodaj niego utworzoną wcześniej listę.
Sprawdź teraz rozmiar zbioru. Czy wiesz z czego wynika różnica między rozmiarem listy i  zbioru?
1.6.Wypisz listę oraz zbiór używając pętli.
 */

public class App {
    public static void main(String[] args) {
        List listaNumerów = Arrays.asList(1, 2, 2, -2, 4, 5, 13, 3, 2, 1, 1, 18, 37, 3);

        wyświetlListę(listaNumerów);
        System.out.println("Posortowana lista:");
        wyświetlListę(posortujListę(listaNumerów));
        maxiMin(listaNumerów);
        System.out.println("Rozmiar listy to: " + listaNumerów.size());
        wyświetlListę(wpiszListeDoZbioru(listaNumerów));
        System.out.println("Rozmiar zbioru to: "+wpiszListeDoZbioru(listaNumerów).size() + ", bo powtórki zostały nadpisane.");



    }

    private static List<Integer> posortujListę(List<Integer> lista) {
        List<Integer> listaNumerowPosortowana = new ArrayList<>();
        Map<Integer, Integer> mapa = new HashMap<>();
        int i = 0;
        for (Integer integer : lista) {
            mapa.put(i, integer);
            i++;
        }
        for (Integer key : mapa.keySet()) {
            listaNumerowPosortowana.add(mapa.get(key));
        }
        return listaNumerowPosortowana;
    }

    private static void wyświetlListę(List lista) {

        int i = 1;
        for (Object o : lista) {
            System.out.println(i + " : " + o);
            i++;
        }

    }

    private static void wyświetlListę(Set set) {

        int i = 1;
        for (Object o : set) {
            System.out.println(i + " : " + o);
            i++;
        }

    }

    private static void maxiMin(List<Integer> lista) {
        int max = lista.get(0);
        int min = lista.get(0);
        for (Integer integer : lista) {
            if (integer > max) max = integer;
            if (integer < min) min = integer;
        }
        System.out.println("Max to: " + max + " Min to: " + min);
    }

    private static Set wpiszListeDoZbioru (List<Integer> lista){
        Set <Integer> zbiorZListy = new HashSet<>();
        for (Integer integer : lista) {
            zbiorZListy.add(integer);

        }
        return zbiorZListy;
    }
}
