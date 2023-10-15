import java.time.LocalDate;

class Battery {
    // Assume you have appropriate fields and methods for the Battery class

    // Sample method for demonstration purposes
    public void someBatteryMethod() {
        // Some code specific to the Battery class
    }
}

public class NubbinBattery extends Battery {
    private LocalDate currentDate;
    private LocalDate lastServiceDate;
    private int nubbinYearNeedService = 3;

    public NubbinBattery(LocalDate currentDate, LocalDate lastServiceDate) {
        this.currentDate = currentDate;
        this.lastServiceDate = lastServiceDate;
    }

    public boolean needsService() {
        LocalDate dateNeedService = lastServiceDate.plusYears(nubbinYearNeedService);
        return dateNeedService.isBefore(currentDate);
    }
}
