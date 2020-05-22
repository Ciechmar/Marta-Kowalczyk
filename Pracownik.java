package zadaniaDomowe.kolekcje;

public class Pracownik {
    String imie;
    int wiek;
    double pensja;
    int staz;
    Plec plec;
    long nrKonta;

    public Pracownik(String imie, int wiek, double pensja, int staz, Plec plec, long nrKonta) {
        this.imie = imie;
        this.wiek = wiek;
        this.pensja = pensja;
        this.staz = staz;
        this.plec = plec;
        this.nrKonta = nrKonta;
    }

    @Override
    public String toString() {
        return "Pracownik[" +
                "imie = " + imie +
                ", wiek = " + wiek +
                ", staz = " + staz +
                ", plec = " + plec +
                ']';
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
}
