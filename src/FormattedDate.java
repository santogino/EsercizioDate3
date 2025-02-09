import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class FormattedDate {
    public static String readMonth(OffsetDateTime date) {
        Month month = date.getMonth();
        return month.name();
    }

    public static String dayOfWeek(OffsetDateTime date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.name();
    }

    public static Integer readYear(OffsetDateTime date) {
        return date.getYear();
    }

    public static Integer readDayOfYear(OffsetDateTime date) {
        return date.getDayOfYear();
    }
}
