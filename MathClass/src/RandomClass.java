import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt = " + randomInt);
    }
 
}
