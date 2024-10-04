package PlantClasses;

//Interface, används för att huvudprogrammet endast ska komma åt det som behövs för programmet.
public interface WaterMessage {

    void wateringMessage(WaterMessage plant);
    String getName();
}
