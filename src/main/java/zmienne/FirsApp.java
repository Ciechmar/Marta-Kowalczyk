package zmienne;

public class FirsApp {
    public static void main(String[] args) {
       int i = 5;
       double d = 5.6;
       float f = 12;
//        System.out.println(i*d);
//
//        i = (int) d;
//        System.out.println(i);
//
//        System.out.println(dodawanie(5, 5));
//        System.out.println(odejmowanie(4,7));
//        System.out.println(mnożenie(6,8));
        System.out.println(dzielenie(2,3));
        System.out.println(czyparzysta(9));

    }






    public static int dodawanie (int a, int b){
        return a+b;
    }
    public static int odejmowanie (int a, int b){
        return a-b;
    }
    public static int mnożenie (int a, int b){
        return a*b;
    }
    public static double dzielenie (int a, int b){
        return a/b;
    }
    public static boolean czyparzysta (int a){


        return (a % 2) == 0;
    }

}
