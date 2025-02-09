import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
class FormattedDateTest {
    private OffsetDateTime date;

    @BeforeEach
    public void setup() {
        date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    }

    @Test
    void readMonth() {
        assertEquals("MARCH", FormattedDate.readMonth(date));
    }

    @Test
    void dayOfWeek() {
        assertEquals("WEDNESDAY", FormattedDate.dayOfWeek(date));
    }

    @Test
    void readYear() {
        assertEquals(2023, FormattedDate.readYear(date));
    }

    @Test
    void readDayOfYear() {
        assertEquals(60, FormattedDate.readDayOfYear(date));
    }
}