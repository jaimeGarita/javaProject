

public class PrimitiveCharacters {



    public static void main(String[] args) {
        char character = '\u0040'; //char is based in unicode standard
        char decimal = 64;
        /*EXPRESSION BOOLEAN*/                      /*RELATION OPERATORS*/
        System.out.println("character = decimal " + (character==decimal));
        System.out.println();
        char symbol = '@';

        System.out.println("symbol = character " + (symbol == character));

        /*CHAR CONST*/
        System.out.println("char in bytes " + Character.BYTES);
        System.out.println("char in size " + Character.SIZE);
        System.out.println("char max value " + Character.MAX_VALUE);
        System.out.println("char min value " + Character.MIN_VALUE);


        /*ESPECIAL CHAR*/
        char space = '\u0020'; //SPACE IN UNICODE
        char backSpace='\b'; //Back off to variable space
        char tabulator = '\t';
        char newLine = '\n';
        char newLineReturn ='\r';

        String name = "Jaime";
        System.out.println("name ="+space + name + backSpace); //CONCATENATE VARIABLES
        System.out.println("Test" + System.getProperty("line.separator")); //ITS SAME \n OR \r CHAR
        System.out.println("Test2"+ System.lineSeparator()); //ITS SAME LINE 33
    }

}
