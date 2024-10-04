import PlantClasses.*;

import javax.swing.*;
import java.util.*;

public class Main {

    Main() {
        WaterMessage Igge = new Cactus(0.2, "Igge");
        WaterMessage Laura = new Palm(5, "Laura");
        WaterMessage Meatloaf = new Carnivore(0.7, "Meatloaf");
        WaterMessage Olof = new Palm(1, "Olof");

        List<WaterMessage> plantList = new ArrayList<>(Arrays.asList(Igge, Laura, Meatloaf, Olof));

        boolean dialogInput = true;

        while (dialogInput) {
            boolean inputPlantMatch = false;
            String inputName = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");

            if (inputName == null) {
                dialogInput = false;
                continue;
            }

            for (WaterMessage p : plantList) {
                if (inputName.equalsIgnoreCase(p.getName())) {
                    p.wateringMessage(p);
                    inputPlantMatch = true;
                }
            }
            if (inputPlantMatch != true) {
                JOptionPane.showMessageDialog(
                null, "Den här växten finns inte på hotellet, försök igen.");
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}