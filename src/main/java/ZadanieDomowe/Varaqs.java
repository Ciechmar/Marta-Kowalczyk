package ZadanieDomowe;

import java.util.ArrayList;
import java.util.List;

public class Varaqs {
    public static void main(String[] args) {

        System.out.println("Suma argumentów to: " +sum(4,6,9,1,23,45,90,1));

        List<String> list = new ArrayList<>();
        nameList(list, "Tomek", "Kasia", "Zuzia", "Mateusz", "Luiza");
        showList(list);





    }

    public static int sum (int ... args){
        int b = 0;
        for (int a:args) {
            b = b + a;
        }
        return  b;
    }

    public static List<String> nameList (List list, String ... args){

        for (String a : args) {
            list.add(a);
        }

        return list;
    }

    public static void showList (List list){
        int i = 0;
        while (list.size() - i > 0) {
            System.out.println(list.get(i));
            i++;
        }
    }




}
