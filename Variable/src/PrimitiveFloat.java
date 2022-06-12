public class PrimitiveFloat {

    static float varFloat; //Visibility global, all method that you declarate global, inicializate 0

    public static void main(String[] args){

        /*FLOAT = 1,3 = ERROR*/
        /*YOU NEED TO ADD F BECAUSE THE DATATYPE SYNC TO DOUBLE DATA TYPE AND YOU USE FLOAT DATA TYPE*/
        float real = 1.3f;

        float real2 = 2.12e3f;
        System.out.println("real " + real2);

        /*FLOAT CONSTANT*/
        System.out.println("float corresponds to byte = " + Float.BYTES);
        System.out.println("float corresponds to bites = " + Float.SIZE);

        /*MAXIMUM AND MINIMUM*/
        System.out.println("\n");
        System.out.println("the maximum float valor = " + Float.MAX_VALUE);
        System.out.println("the minimum float valor = " + Float.MIN_VALUE);

        System.out.println("\n\n");
        double realDouble = 3.40828235E38;
        System.out.println("realDouble = " + realDouble);

        /*FLOAT CONSTANT*/
        System.out.println("double corresponds to byte = " + Double.BYTES);
        System.out.println("double corresponds to bites = " + Double.SIZE);

        /*MAXIMUM AND MINIMUM*/
        System.out.println("\n");
        System.out.println("the maximum double valor = " + Double.MAX_VALUE);
        System.out.println("the minimum double valor = " + Double.MIN_VALUE);

        System.out.println("Valor "+varFloat);

    }
}
