package Adapter;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter dateAdapter = new CalendarToNewDateAdapter();

        // Asetetaan päivä nykyiseen päivään
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        dateAdapter.setDay(day);
        dateAdapter.setMonth(month);
        dateAdapter.setYear(year);

        System.out.println("Aloituspäivä: " + dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());

        // Kysytään käyttäjältä montako päivää halutaan lisätä
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kuinka monta päivää haluat lisätä? : ");
        int days = scanner.nextInt();
        dateAdapter.advanceDays(days);

        System.out.println("Uusi Päivä: " + dateAdapter.getDay() + "." + dateAdapter.getMonth() + "." + dateAdapter.getYear());
    }
}
