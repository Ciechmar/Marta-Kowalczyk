package ZadanieDomowe;


import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class TimeAndData {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDateTime dataTime = LocalDateTime.now();
        System.out.println("Data: " + data); //Zad 1
        LocalDate data2 = LocalDate.of(2020, 01, 01);
        LocalDate data3 = LocalDate.of(2020, 12, 31);
        System.out.println("Data: " + dataTime);
        System.out.println("Dni od początku roku upłyneło: " + ChronoUnit.DAYS.between(data2, data)); //Zad 2
        System.out.println("Dni do kńca roku jeszcze : " + ChronoUnit.DAYS.between(data, data3)); //Zad 3
//        System.out.println("Od jakiej daty mam policzyć dni ? Poddaj w formacie YYYY-MM-DD ");
//        Scanner scanner = new Scanner(System.in);
//        String odData = scanner.nextLine();
//
//        System.out.println("Do jakiej daty ?");
//        String doData = scanner.nextLine();
//        ileMinełoMiedzyDanatami(odData, doData);

        LocalDate oddData = LocalDate.of(1985, 05, 25);
        LocalDate dooData = LocalDate.of(2012, 04, 03);
        ileMinełoMiedzyDanatami(oddData, dooData);

        dodajDni(50, LocalDate.now());

        System.out.println(0%2);





    }

    private static  void ileMinełoMiedzyDanatami (LocalDate odData, LocalDate doData) {
        if (odData.isBefore(doData)){                                                               // Zad 5
        System.out.println(" Między datami mineło : " + ChronoUnit.DAYS.between(odData, doData));
        }
        else {
            System.out.println(" Między datami mineło : " + ChronoUnit.DAYS.between(doData, odData));
        }
    }

    private static  void ileMinełoMiedzyDanatami (String odData, String doData) {
        LocalDate ld1 = LocalDate.parse(odData);
        LocalDate ld2 = LocalDate.parse(doData);
        ileMinełoMiedzyDanatami(ld1,ld2);

    }
    private static void dodajDni (int ileDni, LocalDate ld){
        System.out.println("Za " + ileDni + " dni będzie " + ld.plusDays(ileDni));
    }
}
