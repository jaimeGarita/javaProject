import java.util.*;

public class TernaryOperatorGreaterNumber {
    public static void main(String[] args) {
        int max = 0;

        Scanner sc= new Scanner(System.in);

        System.out.println("Input integer");
        int num1 = sc.nextInt();

        System.out.println("Input 2 integer");
        int num2 = sc.nextInt();

        System.out.println("Input 3 integer");
        int num3 = sc.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        System.out.println("Te Greater number is =" + max);



    }
}
