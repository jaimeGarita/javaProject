public class ExampleClassMath {
    public static void main(String[] args) {

        int absolute = Math.abs(-3);
        System.out.println("absoluto = " + absolute);

        double max = Math.max(3.5, 2);
        System.out.println("max = " + max);

        double min = Math.min(3.4,-1);
        
        
        /*ROUND OUT*/
        double ceil = Math.ceil(3.5);
        System.out.println("ceil = " + ceil);

        /*TRUNCATION*/
        double trunc = Math.floor(3.5);

        long integer = Math.round(3.5);
        System.out.println("integer = " + integer);
    }
}
