public class NumericalSystem {
    public static void main(String[] args) {

        int decimalNum = 10;
        System.out.println("decimalNum = " + decimalNum);

        /*CONVERSION*/
        System.out.println("Decimal number " + decimalNum +" in binary is = " + Integer.toBinaryString(decimalNum)); //CONVERSION TO BINARY

        int binaryNumber = 0b101001; //0b MAKES THE COMPILER UNDERSTAND THAT IT IS AN BINARY NUMBER AND NOT A INT
        System.out.println("BinaryNumber = " + binaryNumber);

        System.out.println("Decimal number " + binaryNumber + "In binary is =" + Integer.toOctalString(binaryNumber));
        int octalNumber = 0764; //0 MAKES THE COMPILER UNDERSTAND THAT IT IS AN OCTAL NUMBER AND NOT A INT

        System.out.println("octalNumber = " + octalNumber);

        System.out.println("The decimal number " + decimalNum + " = " + Integer.toHexString(decimalNum));
        int hexNumber = 0x1f4; //0x MAKES THE COMPILER UNDERSTAND THAT IT IS AN HEXADECIMAL NUMBER AND NOT A INT


    }
}
