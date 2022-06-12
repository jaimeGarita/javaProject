public class AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int sum = 0;

        for (Integer i : ints) {
            if (i.intValue() % 2 == 0) { //intValue return primitive int
                sum += i.intValue();
            }



        }
        System.out.println("sum = " + sum);
        sum = 0;
        for (Integer i : ints) {
            if (i % 2 == 0) { 
                sum += i;
            }

        }
        System.out.println("sum = " + sum);


    }
}
