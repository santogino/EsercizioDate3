import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String month = FormattedDate.readMonth(date);
        System.out.println("Mese: " + month);

        String dayOfTheWeek = FormattedDate.dayOfWeek(date);
        System.out.println("Giorno della settimana: " + dayOfTheWeek);

        Integer year = FormattedDate.readYear(date);
        System.out.println("Anno: " + year);

        Integer dayOfTheYear = FormattedDate.readDayOfYear(date);
        System.out.println("Il giorno dell'anno è: " + dayOfTheYear);
    }
}