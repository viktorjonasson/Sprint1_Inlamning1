package PlantClasses;

public class Cactus extends Plant {

    public Cactus(double heightInMeters, String name) {
        super(heightInMeters, name);
        baseWaterInLit = 0.02;
        litOfWaterPerMeter = 0;
        waterTypeString = WaterType.MINERAL_WATER.waterTypeString;
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
