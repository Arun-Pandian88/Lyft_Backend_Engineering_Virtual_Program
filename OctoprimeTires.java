public class OctoprimeTires extends Tires {
    private double[] tireWear;
    private double tireNeedToService = 3.0;

    public OctoprimeTires(double[] tireWear) {
        this.tireWear = tireWear;
    }

    public boolean needsService() {
        double totalTireWear = 0.0;
        for (double tire : tireWear) {
            totalTireWear += tire;
        }
        return totalTireWear >= tireNeedToService;
    }
}
