package PlantClasses;

// Subklass till Plant, exempel på arv.

public class Cactus extends Plant  {

    public Cactus(double heightInMeters, String name) {
        super(heightInMeters, name);
        baseWaterInLit = 0.02;
        litOfWaterPerMeter = 0;
        waterTypeString = WaterType.MINERAL_WATER.waterTypeString;
    }
}
