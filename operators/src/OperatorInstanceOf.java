public class OperatorInstanceOf {
    public static void main(String[] args) {

        String text = "Creatin a String object ..."; //object text
        /*AUTOBOXING*/
        Integer num = 7; //Reference int, it's an int wrapped num is a object
        //ALL OF CLASS AND OBJECT INHERIT TO CLASS Object
        Boolean b1 = text instanceof  Object;

        System.out.println("b1 = " + b1);

        b1 = text instanceof  String;

        System.out.println("b1 = " + b1);
        
        b1 = num instanceof Integer;

        System.out.println("b1 = " + b1);
        //INTS A INHEIRT OF NUMBER
        b1 = num instanceof Number;
        
        b1 = num instanceof Object;
        System.out.println("b1 = " + b1);
        
        Double decimal = 1.11;

        b1 = decimal instanceof Number;
        System.out.println("decimal = " + decimal);
        
        b1 = b1 instanceof Boolean;
        System.out.println("b1 = " + b1);
        
    }
}
