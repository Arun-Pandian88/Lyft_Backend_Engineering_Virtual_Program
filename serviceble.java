public interface Serviceable {
    boolean needsService();
}

public class Car implements Serviceable {
    private Engine engine;
    private Battery battery;
    private Tires tires;

    public Car(Engine engine, Battery battery, Tires tires) {
        this.engine = engine;
        this.battery = battery;
        this.tires = tires;
    }

    @Override
    public boolean needsService() {
        return engine.needsService() || battery.needsService() || tires.needsService();
    }
}

public class Engine implements Serviceable {
    @Override
    public boolean needsService() {
        // Implementation for engine service check
        return false; // Replace with your logic
    }
}

public class Battery implements Serviceable {
    @Override
    public boolean needsService() {
        // Implementation for battery service check
        return false; // Replace with your logic
    }
}

public class Tires implements Serviceable {
    @Override
    public boolean needsService() {
        // Implementation for tires service check
        return false; // Replace with your logic
    }
}

