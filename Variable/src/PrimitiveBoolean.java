public class PrimitiveBoolean {
    public static void main(String[] args) {
        boolean logicData = true;
        boolean returnData = Boolean.FALSE; //IS A OBJECT AND RETURN BOOLEAN OBJECT
        boolean data = new Boolean(true);

        double d = 845.45454e-3; //Real number with scientific notation
        System.out.println("d = " + d);
        
        float f = 13948.3e1f; //f at end to float number
        System.out.println("f = " + f);

        logicData = d < f;
        System.out.println("logicData = " + logicData);

        boolean isEqual = 3-2 == 1;
        System.out.println("isEqual = " + isEqual);
    }
}
