package PlantClasses;

// Subklass till Plant, exempel på arv.

public class Carnivore extends Plant  {

    public Carnivore(double heightInMeters, String name) {
        super(heightInMeters, name);
        baseWaterInLit = 0.1;
        litOfWaterPerMeter = 0.2;
        waterTypeString = WaterType.PROTEIN_WATER.waterTypeString;
    }
}
