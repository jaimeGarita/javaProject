public class WrappedBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 22;
        num2 = 22;
        
        boolean  primBool = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBool);
        System.out.println("objBoolean = " + objBoolean);
        
        Boolean objBoolean2 = Boolean.valueOf("false"); //PARAMETER TO VALUEOF IS BOOL OR STRING
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("comparing two boolean objects " + (objBoolean == objBoolean2)); //COMPARATE TO VALUE, IT IS NOT COMPARED THE SAME AS IN THE INTEGER

        System.out.println("(num1.equals(num2)) = " + (num1.equals(num2)));
        System.out.println(" num1 == num2 " + (num1 == num2));

        boolean primBoolean2 = objBoolean2.booleanValue(); //RETURN PRIMITIVE VALUE //AN-BOXING

    }
}
