package PlantClasses;

import javax.swing.*;

abstract public class Plant implements WaterMessage {
    private String name;
    private double heightInMeters;
    protected String waterTypeString;
    protected double baseWaterInLit;
    protected double litOfWaterPerMeter;

    public Plant(double heightInMeters, String name) {
        this.heightInMeters = heightInMeters;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public double waterAmountCalculator(Plant plant) {
        return (plant.getHeightInMeters() * plant.litOfWaterPerMeter) + (plant.baseWaterInLit);
    }

    @Override
    public void wateringMessage(WaterMessage plant) {
        JOptionPane.showMessageDialog(null, "Växten " + this.getName() +
                " behöver " + waterAmountCalculator((Plant) plant) + " liter " + this.waterTypeString);
    }
}
