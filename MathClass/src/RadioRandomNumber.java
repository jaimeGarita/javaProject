import java.util.Random;

public class RadioRandomNumber {
    public static void main(String[] args) {

        final double PI = 3.141592653589793;

        Random randomObj = new Random();


        Double randomNum = randomObj.nextDouble();
        randomNum *=10;

        double area = PI * Math.pow(randomNum, 2);

        System.out.println("the area of radio " + randomNum + " is " + area);
    }
}
