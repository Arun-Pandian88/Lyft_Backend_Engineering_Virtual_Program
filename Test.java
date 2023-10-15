import org.junit.jupiter.api.Test;

public class TestWilloughbyEngine {
    @Test
    public void testNeedsServiceTrue() {
        int currentMileage = 67031;
        int lastServiceMileage = 0;
        WilloughbyEngine engine = new WilloughbyEngine(currentMileage, lastServiceMileage);
        assertTrue(engine.needsService());
    }

    @Test
    public void testNeedsServiceFalse() {
        int currentMileage = 60019;
        int lastServiceMileage = 20;
        WilloughbyEngine engine = new WilloughbyEngine(currentMileage, lastServiceMileage);
        assertFalse(engine.needsService());
    }
}

public class TestCapuletEngine {
    @Test
    public void testNeedsServiceTrue() {
        int currentMileage = 30001;
        int lastServiceMileage = 0;
        CapuletEngine engine = new CapuletEngine(currentMileage, lastServiceMileage);
        assertTrue(engine.needsService());
    }

    @Test
    public void testNeedsServiceFalse() {
        int currentMileage = 30000;
        int lastServiceMileage = 0;
        CapuletEngine engine = new CapuletEngine(currentMileage, lastServiceMileage);
        assertFalse(engine.needsService());
    }
}

public class TestSternmanEngine {
    @Test
    public void testNeedsServiceTrue() {
        boolean warningLightIsOn = true;
        SternmanEngine engine = new SternmanEngine(warningLightIsOn);
        assertTrue(engine.needsService());
    }

    @Test
    public void testNeedsServiceFalse() {
        boolean warningLightIsOn = false;
        SternmanEngine engine = new SternmanEngine(warningLightIsOn);
        assertFalse(engine.needsService());
    }
}
