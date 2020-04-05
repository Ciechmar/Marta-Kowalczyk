package zadania;

public class SprawdzatorLiczbPierwszych {

//    private  int[] liczbyPierwsze = {2,3,5,7,};
    private  int[] liczbyPierwsze;

    public SprawdzatorLiczbPierwszych(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    public boolean czyPierwsza (int a){
        boolean isEgual =false;
        for (int i :liczbyPierwsze){
            if (i ==a) {
                return true;
            }
        }
        return false;
    }


}
