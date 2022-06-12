import javax.swing.*;

public class BmiCalculator {
    public static void main(String[] args) {
            String kgStr = JOptionPane.showInputDialog(null, "Select your KG") ; //Panel to open
            String cmStr = JOptionPane.showInputDialog(null, "Select your CM");

            float kg=0f;
            float cm=0f;

            try{
                kg = Float.parseFloat(kgStr); //CONVERSION  STRING TO FLOAT
                cm = Float.parseFloat(cmStr);

            }catch(NumberFormatException e){ //This use to
                JOptionPane.showMessageDialog(null, "Please select a integer number");
                main(args); //GO TO MAIN WITH ARGS
                System.exit(0); //EXIT PROGRAM
            }

            /*Window Result*/

            JOptionPane.showMessageDialog(null,"Your imc " + (kg/(cm*2)) );
    }
}
