package PlantClasses;

// Subklass till Plant, exempel på arv.

public class Palm extends Plant  {

    public Palm(double heightInMeters, String name) {
        super(heightInMeters, name);
        baseWaterInLit = 0;
        litOfWaterPerMeter = 0.5;
        waterTypeString = WaterType.TAP_WATER.waterTypeString;
    }
}
