public class PrimitiveInt {
    public static void main(String[] args){

        /*Primitive Number INT*/

        /*Range -128 to 127*/
        byte wholeByte = 127;
        System.out.println("Type byte " + Byte.BYTES);
        System.out.println("Size bites " + Byte.SIZE);

        /*MAXIMUM AND MINIMUM*/
        System.out.println("Value maximum for a Byte: " + Byte.MAX_VALUE);
        System.out.println("Value minimum for a Byte: " + Byte.MIN_VALUE);


        /*Range -32767 to 32767*/
        short wholeShort = 32767;
        System.out.println("\n");

        System.out.println("Short Bytes " + Short.BYTES);
        System.out.println("Size Short bites " + Short.SIZE);

        /*MAXIMUM AND MINIMUM*/
        System.out.println("Value maximum for a Short: " + Short.MAX_VALUE);
        System.out.println("Value minimum for a Short: " + Short.MIN_VALUE);

        /*Medium Range*/
        int wholeInt;

        /*Long Range*/
        long wholeLong;

        System.out.println("\n");

        /*THOUGHT THE NUMBER THAT YOU ADD IS IN THE SAME RANGE TO ANOTHER DATA TYPE, THE FLEXIBLE VARIABLE USE INT*/
        var wholeVar = 127;
        System.out.println("wholeVar = " + wholeVar);

        /*IF THE NUMBER THAT YOU ADD PASS THE INT LIMIT, YOU NEED TO LONG DATA TYPE. IF YOU ADD LETTER L IN THE END TO ADD THE VALUE USE LONG DATA TYPE*/
        var wholeVar2= 2147483648L;
        System.out.println("wholeVar2 = " + wholeVar2);

        /*IF THE NUMBER THAT YOU ADD PASS THE LONG LIMIT, YOU NEED TO FLOAT DATA TYPE. IF YOU ADD LETTER F IN THE END TO ADD THE VALUE USE FLOAT DATA TYPE*/
        var WholeVar3=922337203685477580F;

        System.out.println("WholeVar3 = " + WholeVar3);

    }
}
