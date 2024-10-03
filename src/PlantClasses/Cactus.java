package PlantClasses;

public class Cactus extends Plant implements WaterMessage {

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

//    @Override
//    public String wateringMessage(WaterMessage plant) {
//        return "Växten " + this.getName() + " behöver " + waterAmountCalculator((Plant) plant) + " liter " + this.waterTypeString;
//    }

    @Override
    public void wateringMessage(WaterMessage plant) {
        super.wateringMessage(plant);
    }



    /*@Override
    public double waterAmountLitres(Plant plant) {
        return (plant.getHeightInMeters() * plant.litOfWaterPerMeter) + (plant.baseWaterInLit);
        //return PrintMethod.waterAmountLitresTest(plant);
    }*/
}
