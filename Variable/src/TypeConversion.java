public class TypeConversion {
    public static void main(String[] args) {
        
        String numStr = "50";
        
        int numInt = Integer.parseInt(numStr); //WE CAN CONVERT WITH EACH TYPE
        System.out.println("numInt = " + numInt);

        String realStr = "944.944e-2"; //SCIENTIFIC NOTATION
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String boolStr = "true";
        boolean boolBool = Boolean.parseBoolean(boolStr);
        System.out.println("boolBool = " + boolBool);
        
        int otherNumberInt = 100;
        System.out.println("otherNumberInt = " + otherNumberInt);
        
        String otherNumberStr = Integer.toString(otherNumberInt);
        System.out.println("otherNumberStr = " + otherNumberStr);
        
        otherNumberStr = String.valueOf(otherNumberInt+10);//METHOD OVERLOAD SUM AND DOES NOT CONCATENATE
        System.out.println("otherNumberStr = " + otherNumberStr);

        double otherRealDouble = 1.23456e2;
        String otherRealStr = Double.toString(otherRealDouble);
        System.out.println("otherRealStr = " + otherRealStr);

        otherRealStr = String.valueOf(1.23456f);
        System.out.println("otherRealStr = " + otherRealStr);

        /*CASTING*/
        int i = 1000;
        short s = (short)i;
        long l = i;
        System.out.println("\ns = " + s);
        System.out.println("l = " + l);

        float f = (float) i;
        System.out.println("f = " + f);

    }
}
