
import java.time.LocalDate;

 class Battery {
    // Assume you have appropriate fields and methods for the Battery class

    // Sample method for demonstration purposes
    public void someBatteryMethod() {
        // Some code specific to the Battery class
    }
}

public class SpindlerBattery extends Battery {
    private LocalDate currentDate;
    private LocalDate lastServiceDate;
    private int spindlerYearNeedService = 4;

    public SpindlerBattery(LocalDate currentDate, LocalDate lastServiceDate) {
        this.currentDate = currentDate;
        this.lastServiceDate = lastServiceDate;
    }

    public boolean needsService() {
        LocalDate dateNeedService = lastServiceDate.plusYears(spindlerYearNeedService);
        return dateNeedService.isBefore(currentDate);
    }
}

