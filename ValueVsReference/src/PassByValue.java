public class PassByValue {
    public static void main(String[] args) {

        int i = 10;
        //wrapped classes are immutable whenever we modify the value we return a new instance
        System.out.println("start the main method = " + i);
        test(i);
        System.out.println("Finish the method main with i= " + i);
    }

    public static void test(int i){
        System.out.println("start the test method= " + i);
        i = 35;
        System.out.println("Finish the method test with i= " + i);
    }
}
