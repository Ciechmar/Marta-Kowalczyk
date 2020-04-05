package zadania;

public class LiczbaPierwsza {
    public static void main(String[] args) {
//        System.out.println(MathUtils.czyPierwsza(3));
//        System.out.println(MathUtils.czyPierwsza(4));
//        System.out.println(MathUtils.czyPierwsza(5));
//        System.out.println(MathUtils.czyPierwsza(6));
//        System.out.println(MathUtils.czyPierwsza(2));
//        System.out.println(MathUtils.czyPierwsza(210));
//        System.out.println(MathUtils.czyPierwsza(9));



        int [] tablicaLiczbPierwszysch = new int []{ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        SprawdzatorLiczbPierwszych sprawdzatorLiczbPierwszych = new
                SprawdzatorLiczbPierwszych(tablicaLiczbPierwszysch);
        System.out.println(sprawdzatorLiczbPierwszych.czyPierwsza(9));


    }
}
