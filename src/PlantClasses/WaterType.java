package PlantClasses;

// Här har vi mina enums, såklart.
// Har valt att göra vätsketypen till detta eftersom det är bara är några begränsade egenskaper.
// Har satt ett extra värde redan här så att utskriften senare ska bli snygg.
public enum WaterType {
    TAP_WATER ("kranvatten"),
    MINERAL_WATER ("mineralvatten"),
    PROTEIN_WATER ("proteindryck");

    // Definition av variabel
    public final String waterTypeString;

    // Konstruktor
    WaterType(String s) {
        this.waterTypeString = s;
    }
}
