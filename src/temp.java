    import javax.swing.*;

    class temp {
        public static void main (String[] arg) {
            String namn;
            String hälsning;
            namn = JOptionPane.showInputDialog("Vad heter du?"); //Ändring från innan
            hälsning = "Välkommen " + namn;
            JOptionPane.showMessageDialog(null, hälsning); //Ändring från innan
        }
    }

