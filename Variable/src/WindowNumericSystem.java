import javax.swing.*;

public class WindowNumericSystem {
    public static void main(String[] args) {

        String numberStr = JOptionPane.showInputDialog(null, "Enter an integer"); //Java Option Pane in API SWING //(ESP) MOSTRAR UNA VENTANA DE DIALOGO PARA VENTANA
        int decimalNum = 0; //DECLARATION OUT OF TRY

        try{
            decimalNum = Integer.parseInt(numberStr); //CAST STRING TO INT
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error you enter an integer");
            main(args); //CALL TE ARGUMENT MAIN
            System.exit(0); //IS SIMILAR RETURN 0
        } //Catch es un bloque de codigo, que coge el argumento de excpecion. e es de excepcion



        System.out.println("decimalNum = " + decimalNum);

        /*CONVERSION*/

        String binaryText ="Decimal number " + decimalNum + " in binary is = " + Integer.toBinaryString(decimalNum); //CONVERSION TO BINARY
        System.out.println(binaryText);

        int binaryNumber = 0b1010; //0b USE BECAUSE WE NEED TO DECLARATION A BINARY NUMBER
        String octalText = "The Octal number " + decimalNum + " = " + Integer.toOctalString(decimalNum);

        int octalNumber = 012; //0 USE BECAUSE WE NEED TO DECLARATION A OCTAL NUMBER

        String hexText = "The Hexadecimal number " + decimalNum + " = " + Integer.toHexString(decimalNum);

        int hexaNumber = 0xa; //0x USE BECAUSE WE NEED TO DECLARATION A HEXADECIMAL NUMBER




        /*SHOW RESULT IN A WINDOW*/


        String result = numberStr;
        result +="\n" + binaryText;
        result +="\n" + octalText;
        result +="\n" + hexText;

        JOptionPane.showMessageDialog(null, result);





    }
}
