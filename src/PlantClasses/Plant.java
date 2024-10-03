package PlantClasses;

import javax.swing.*;

/*Här har vi lite exempel på inkapsling.
- Jag har satt två variabler till private, de går endast att nå från denna klass.
- Lite längre ner har vi getters och setters som säkert sätter och hämtar värdet.
- Jag anropar dessutom mina setters från konstruktorn, om man senare vill göra något annat vid initialiseringen av
variablerna, typ validera input, behöver man bara göra detta där.
- Tre variabler är protected, detta för att de ska kunna nås av subklasserna. Dessa har värden som är gemensamma för
hela klassen därav initialiserar jag dem i subklasserna och gör inga konstruktorer eller setters här då de aldrig
ska ändras. Eftersom de är protected kan mitt huvudprogram inte ändra dem.
 */

abstract public class Plant implements WaterMessage {
    private String name;
    private double heightInMeters;
    protected String waterTypeString;
    protected double baseWaterInLit;
    protected double litOfWaterPerMeter;

    public Plant(double heightInMeters, String name) {
        setHeightInMeters(heightInMeters);
        setName(name);
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

    // Här har vi en kalkylator för att räkna ut vattenmängden.
    // Jag har medvetet gjort den generell för att slippa kopior av kod.
    public double waterAmountCalculator(Plant plant) {
        return (plant.getHeightInMeters() * plant.litOfWaterPerMeter) + (plant.baseWaterInLit);
    }

    // Implementering av interfacet WaterMessage:s metod som meddelar användaren vad och hur mycket vätska växten ska få.
    @Override
    public void wateringMessage(WaterMessage plant) {
        JOptionPane.showMessageDialog(null, "Växten " + this.getName() +
                " behöver " + waterAmountCalculator((Plant) plant) + " liter " + this.waterTypeString);
    }
}
