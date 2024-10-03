import PlantClasses.*;

import javax.swing.*;
import java.util.*;

public class Main {

    Main() {
        Plant Igge = new Cactus(0.2, "Igge");
        Plant Laura = new Palm(5, "Laura");
        Plant Meatloaf = new Carnivore(0.7, "Meatloaf");
        Plant Olof = new Palm(1, "Olof");

        List<Plant> plantList = new ArrayList<>(Arrays.asList(Igge, Laura, Meatloaf, Olof));

        boolean dialogInput = true;

        while (dialogInput) {
            boolean inputPlantMatch = false;
            String inputName = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");

            //Denna sats är till för att stänga dialogrutan om användaren klickar på avbryt/cancel eller kryssrutan.
            //Programmet "stängs av" och kraschar inte eftersom vi har kommit ur while-loopen där showInputDialog ligger.
            if (inputName == null) {
                dialogInput = false;
                continue;
            }

            for (Plant p : plantList) {
                if (inputName.equalsIgnoreCase(p.getName())) {
                    p.wateringMessage(p);
                    inputPlantMatch = true;
                    break;
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