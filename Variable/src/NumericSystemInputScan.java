import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericSystemInputScan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Create a instance Scanner
        System.out.println("Enter an integer");

        int decimalNum = 0; //DECLARATION OUT OF TRY

        try{
          decimalNum = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error you enter an integer");
            main(args); //CALL TE ARGUMENT MAIN
            System.exit(0); //IS SIMILAR RETURN 0
        } //Catch es un bloque de codigo, que coge el argumento de excpecion. e es de excepcion



        System.out.println("decimalNum = " + decimalNum);

        /*CONVERSION*/

        String binaryText ="Decimal number " + decimalNum + " in binary is = " + Integer.toBinaryString(decimalNum); //CONVERSION TO BINARY

        String octalText = "The Octal number " + decimalNum + " = " + Integer.toOctalString(decimalNum);

        String hexText = "The Hexadecimal number " + decimalNum + " = " + Integer.toHexString(decimalNum);





        /*SHOW RESULT IN A WINDOW*/


        String result = String.valueOf(decimalNum); //CASTING INT A STRING
        result +="\n" + binaryText;
        result +="\n" + octalText;
        result +="\n" + hexText;

        System.out.println(result);





    }
}
