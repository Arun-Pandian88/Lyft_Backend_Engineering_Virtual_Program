import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TestNubbinBattery {
    @Test
    public void testNeedsServiceTrue() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2019, 1, 27);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        assertTrue(battery.needsService());
    }

    @Test
    public void testNeedsServiceFalse() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2021, 1, 10);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        assertFalse(battery.needsService());
    }
}

public class TestSpindlerBattery {
    @Test
    public void testNeedsServiceTrue() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2017, 1, 25);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        assertTrue(battery.needsService());
    }

    @Test
    public void testNeedsServiceFalse() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2021, 1, 10);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        assertFalse(battery.needsService());
    }
}
