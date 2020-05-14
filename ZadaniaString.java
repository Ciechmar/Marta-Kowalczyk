package zadaniaDomowe;

public class ZadaniaString {

    public static void main(String[] args) {
        String tekst = "Tekst";
        String tekst2 = new String("Tekst");

        System.out.println(tekst.equals(tekst2));

        Osoba osoba = new Osoba("Karol", "M", 18);
        Osoba osoba1 = new Osoba("Karol", "M", 18);

        System.out.println(osoba.equals(osoba1));

        System.out.println("\nHashcode dla osób:");
        System.out.print(osoba.hashCode() + "   ");
        System.out.println(osoba1.hashCode());

        System.out.println("\nHAshcode dla tekstów:");
        System.out.print(tekst.hashCode()+ "   ");
        System.out.println(tekst2.hashCode());

    }
}
