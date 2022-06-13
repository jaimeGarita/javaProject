
public class PassByReference {
    public static void main(String[] args) {
    int[] age = {10,11,12};
    //wrapped classes are immutable whenever we modify the value we return a new instance
        System.out.println("start the main method ");
        for(int i = 0 ; i < age.length ; i++){
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Before to call Method test ");
        test(age);
        System.out.println("After to call Method test ");
        for(int i = 0 ; i < age.length ; i++){
            System.out.println("age[i] = " + age[i]);
        }
        System.out.println("Finish the main method with the age value ");
}
    /*an array can be passed by reference since it is also a pointer, so what the variable contains is the address*/
    public static void test(int[] ageArr) { //REFERENCE
        System.out.println("start the test method");
        for (int i = 0; i < ageArr.length; i++){
            ageArr[i] = ageArr[i]+20;
        }
        System.out.println("Finish the method test with");
    }
}