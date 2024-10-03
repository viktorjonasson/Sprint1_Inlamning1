package PlantClasses;

public class Carnivore extends Plant {

    public Carnivore(double heightInMeters, String name) {
        super(heightInMeters, name);
        baseWaterInLit = 0.1;
        litOfWaterPerMeter = 0.2;
        waterTypeString = WaterType.PROTEIN_WATER.waterTypeString;
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
