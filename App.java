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

2.Utwórz HashSet oraz listę i dodaj do zbioru oraz do listy następujące elementy: 1,2,3,4,5,6,7,8,9
2.1.Wypisz zawartość zbioru oraz listy. Skąd wynika różnica?

3.Stwórz Mapę w której kluczem będzie String, a wartością liczba całkowita.
3.1.Dodaj do mapy następujące elementy: Mateusz:25, Kasia:23, Andrzej:30, Piotr:27
3.2.Wypisz wszystkie klucze znajdujące się w mapie
3.3.Wypisz wszystkie wartości znajdujące się w mapie
3.4.Dodaj do Mapy Mateusz:30 i sprawdź jakie elementy posiada mapa.
    Czy wiesz dlaczego tak się stało?

4*Napisz metodę zwracającą liczbę wystąpień poszczególnych liter w danym łańcuchu znaków. Wykorzystaj do tego Mapę.

5.*Stwórz klasę pracownik z polami: imie, wiek, pensja, staz, plec(typ wyliczeniowy), nr konta. Utwórz klasę, która będzie rejestrem pracownikow.
Utwórz kilku pracowników z różnymi danymi. Następnie stwórz następujące metody(Nie używaj strumieni):
5.1.Znajdująca pracowników z wiekiem większym niz 26
5.2.Znajdująca pracowników, którzy są kobietami i stażem większym niz 3 lata
5.3.Znajdująca pracownikow z imieniem Andrzej i pensją wyższą niż 30000
5.4.Usuwającą pracownika
5.5.Sumująca pensje wszystkich pracownikow i wypisz ją5.6.Tworząca mapę, ktorej kluczem będzie numer konta pracownika, a wartoscia pensja
5.6.1.Wypisz każdy numer konta i pensje.
5.6.2.Wypisz numery kont, których pensja jest większa niż 50005.7.*Dającą wszystkim pracownikom ze stażem większym podwyżkę o 10%
5.7.1.Tylko w przypadku stażu większego niż 5 lat
5.7.2.Tylko w przypadku stażu większego niż 5 lat i posiadania imienia Katarzy
 */

public class App {
    public static void main(String[] args) {
//        Zadanie1

        List listaNumerów = Arrays.asList(1, 2, 2, -2, 4, 5, 13, 3, 2, 1, 1, 18, 37, 3);
        wyświetlListe(listaNumerów);
        System.out.println("Posortowana lista:");
        wyświetlListe(posortujListę(listaNumerów));
        maxiMin(listaNumerów);
        System.out.println("Rozmiar listy to: " + listaNumerów.size());
        wyświetlZbiór(wpiszListeDoZbioru(listaNumerów));
        System.out.println("Rozmiar zbioru to: "+wpiszListeDoZbioru(listaNumerów).size() + ", bo powtórki zostały nadpisane.");

//        Zadanie2
        Set<Integer> zbiorZadanie2 = new HashSet<>();
        List<Integer> listaZadanie2 = new ArrayList<>();
        listaZadanie2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        zbiorZadanie2.addAll(listaZadanie2);
        System.out.println("Lista:");
        wyświetlListe(listaZadanie2);
        System.out.println(listaZadanie2.toString());
        System.out.println("Zbiór:");
        wyświetlZbiór(zbiorZadanie2);
        System.out.println(zbiorZadanie2.toString());
//        W zbiorze, nie jest istonta kolejność, więc nie można pobrać i-tego elementu, można wyświetlić calość przez iteracje po każdym elemencie lub użycie metody .toString().


//        Zadanie3

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Mateusz", 25);
        mapa.put("Kasia", 23);
        mapa.put("Andrzej", 30);
        mapa.put("Piotr", 27);
//        Po dodaniu druiego MAteusza nadpisuje jego Wartość. Klucze nie mogą się dublować.
        mapa.put("Mateusz", 30);
        System.out.println("Wypisać klucze (+ wartości im przypisane)");
        for (String klucz : mapa.keySet()) {
            System.out.println(klucz + ". " + mapa.get(klucz));
        }
        System.out.println("Wypisać wartości:");
        for (Integer wartosc : mapa.values()) {
            System.out.println(wartosc);
        }

//        Zadanie 4

        System.out.println("Zadanie z literkami:");
        Map<Character, Integer> mapka = ilośćWystąpieńZnaków("To jest zadanie do sprawdzenia");
        for (Character klucz : mapka.keySet()) {
            System.out.println(klucz + ". " + mapka.get(klucz));
        }
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

    private static void wyświetlListe(List lista) {

        int i = 1;
        for (Object o : lista) {
            System.out.println(i + " : " + o);
            i++;
        }

    }

    private static void wyświetlZbiór(Set set) {

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

    private static Set wpiszListeDoZbioru(List<Integer> lista) {
        Set<Integer> zbiorZListy = new HashSet<>();
        for (Integer integer : lista) {
            zbiorZListy.add(integer);

        }
        return zbiorZListy;
    }

    private static Map<Character, Integer> ilośćWystąpieńZnaków(String zdanie) {
        zdanie = zdanie.toLowerCase().replace(" ", "");
        Map<Character, Integer> mapa = new HashMap<>();
        char znak;
        for (int i = 0; i < zdanie.length(); i++) {
            znak = zdanie.charAt(i);
            if (mapa.containsKey(znak)) {
                int wartosc = mapa.get(znak);
                wartosc++;
                mapa.put(znak, wartosc);

            } else {
                mapa.put(znak, 1);
            }
        }
        return mapa;
    }
}
