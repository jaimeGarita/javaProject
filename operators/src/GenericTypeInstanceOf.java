public class GenericTypeInstanceOf {
    public static void main(String[] args) {

        Object texto = 1; //OBJECT IS A INSTANCE GENERIC TYPE AND YOU USE FOR ALL TYPE
        Number num = 10; //FATHER OBJECT

        Number num2 = Integer.valueOf(7); //AUTOBOXING RETURN TYPE INTEGER OBJECT
        
        Boolean b1 = texto instanceof String;

        System.out.println("b1 = " + b1); //IS FALSE BECAUSE OBJECT IS A INT TYPE
        
        b1 = num instanceof Short;
        System.out.println("b1 = " + b1);
    }
}
