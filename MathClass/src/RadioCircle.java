import java.util.Scanner;

public class RadioCircle {
    public static void main(String[] args) {
        final double PI = 3.141592653589793;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a radio of circle ");
        double radio = sc.nextDouble();
        
        double area = PI * Math.pow(radio, 2);
        System.out.println("area = " + area);
    }
}
