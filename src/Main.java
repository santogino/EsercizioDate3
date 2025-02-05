//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.text.Format;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        printYear(date);
        printMonth(date);
        printDayOfYear(date);
        printDayOfWeek(date);
    }

    //stampo il mese con l'ENUM Month
    public static void printMonth(OffsetDateTime date) {
        Month month = date.getMonth();
        System.out.println("Mese: " + month);
    }

    //stampo il giorno della settimana con la Classe Enum DayOfWeek
    public static void printDayOfWeek(OffsetDateTime date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }

    //Stampo l'anno salvandolo in un int
    public static void printYear(OffsetDateTime date) {
        int year = date.getYear();
        System.out.println("Anno: " + year);
    }

    public static void printDayOfYear(OffsetDateTime date) {
        int dayOfYear = date.getDayOfYear();
        System.out.println("Giorno dell'anno: " + dayOfYear);
    }
}