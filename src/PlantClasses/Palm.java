package PlantClasses;

public class Palm extends Plant {
    public Palm(double heightInMeters, String name) {
        super(heightInMeters, name);
        baseWaterInLit = 0;
        litOfWaterPerMeter = 0.5;
        waterTypeString = WaterType.TAP_WATER.waterTypeString;
    }

    @Override
    public double waterAmountCalculator(Plant plant) {
        return super.waterAmountCalculator(plant);
    }

    @Override
    public void wateringMessage(WaterMessage plant) {
        super.wateringMessage(plant);
    }
}
