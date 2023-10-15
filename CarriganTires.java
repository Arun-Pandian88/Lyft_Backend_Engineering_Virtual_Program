public class CarriganTires extends Tires {
    private double[] tireWear;
    private double tireNeedToService = 0.9;

    public CarriganTires(double[] tireWear) {
        this.tireWear = tireWear;
    }

    public boolean needsService() {
        for (double tire : tireWear) {
            if (tire >= tireNeedToService) {
                return true;
            }
        }
        return false;
    }
}
