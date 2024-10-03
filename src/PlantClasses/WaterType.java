package PlantClasses;

public enum WaterType {
    TAP_WATER ("kranvatten"),
    MINERAL_WATER ("mineralvatten"),
    PROTEIN_WATER ("proteindryck");

    public final String waterTypeString;

    WaterType(String s) {
        this.waterTypeString = s;
    }
}
