public class WrapperInteger {
    public static void main(String[] args) {
        int primitiveInt = 22768;
        Integer intObject = Integer.valueOf(primitiveInt); //BOXING (ESP) TOMA EL VALOR DEL PARENTESIS Y LO TRANSFORMA EN UN OBJETO //EXPLICIT
        Integer intObject2 = primitiveInt; //AUTOBOXING //IMPLIED //PASS THE PRIMITIVE TO OBJECT
        System.out.println("intObject2 = " + intObject2);


        int num = intObject; //THE OBJECT INTEGER TRANSFORM TO PRIMITIVE
        System.out.println("num = " + num);
        int num2 = intObject2.intValue(); //RETURN THE PRIMITIVE OBJECT
        System.out.println("num2 = " + num2);

        String valueTvLcd = "67000";
        Integer value = Integer.valueOf(valueTvLcd); //String a int

        Short shortObject = intObject.shortValue();
        System.out.println("shortObject = " + shortObject);
    }
}
