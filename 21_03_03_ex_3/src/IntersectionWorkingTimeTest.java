import org.testng.annotations.Test;

import java.time.LocalTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionWorkingTimeTest {
    IntersectionWorkingTime meeting = new IntersectionWorkingTime();

    @Test
    public void test_intersectWorkingTime2_intersectionToTheWest() {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("America/Costa_Rica");
        LocalTime start1 = LocalTime.of(9, 0);
        LocalTime start2 = LocalTime.of(9, 0);
        int res = meeting.intersectWorkingTime(start1, 8, zone1, start2, 8, zone2);
        assertEquals(1, res);
    }

    @Test
    public void test_intersectWorkingTime2_intersectionToTheEast() {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Europe/Moscow");
        LocalTime start1 = LocalTime.of(9, 0);
        LocalTime start2 = LocalTime.of(9, 0);
        int res = meeting.intersectWorkingTime(start1, 8, zone1, start2, 8, zone2);
        assertEquals(6, res);
    }

    @Test
    public void test_intersectWorkingTime2_timeOnBorderOf2Days() {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Europe/Moscow");
        LocalTime start1 = LocalTime.of(22, 0);
        LocalTime start2 = LocalTime.of(23, 0);
        int res = meeting.intersectWorkingTime(start1, 8, zone1, start2, 9, zone2);
        assertEquals(8, res);
    }

    @Test
    public void test_intersectWorkingTime2_noIntersection() {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Pacific/Honolulu");
        LocalTime start1 = LocalTime.of(9, 0);
        LocalTime start2 = LocalTime.of(8, 0);
        int res = meeting.intersectWorkingTime(start1, 8, zone1, start2, 9, zone2);
        assertEquals(0, res);
    }

    @Test
    public void test_intersectWorkingTime2_borderCase() {
        ZoneId zone1 = ZoneId.of("US/Alaska");
        ZoneId zone2 = ZoneId.of("Asia/Kamchatka");
        LocalTime start1 = LocalTime.of(9, 0);
        LocalTime start2 = LocalTime.of(9, 0);
        int res = meeting.intersectWorkingTime(start1, 8, zone1, start2, 8, zone2);
        assertEquals(5, res);
    }

    @Test
    public void test_intersectWorkingTime2_borderCase_ViceVersa() {
        ZoneId zone1 = ZoneId.of("Asia/Kamchatka");
        ZoneId zone2 = ZoneId.of("US/Alaska");
        LocalTime start1 = LocalTime.of(9, 0);
        LocalTime start2 = LocalTime.of(9, 0);
        int res = meeting.intersectWorkingTime(start1, 8, zone1, start2, 8, zone2);
        assertEquals(5, res);
    }

    @Test
    public void test_intersectWorkingTime2_sameTimeZone() {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Europe/Warsaw");
        LocalTime start1 = LocalTime.of(9, 0);
        LocalTime start2 = LocalTime.of(9, 0);
        int res = meeting.intersectWorkingTime(start1, 8, zone1, start2, 8, zone2);
        assertEquals(8, res);
    }
