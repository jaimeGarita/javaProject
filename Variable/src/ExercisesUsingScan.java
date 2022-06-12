import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercisesUsingScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numtxt = "";
        int num = 0;
        int num2 = 0;

            try{
            System.out.println("Choose one number ");
                numtxt = scanner.nextLine();
                num = Integer.parseInt(numtxt);

            System.out.println("Choose other number");
                numtxt = scanner.nextLine();
                num2 = Integer.parseInt(numtxt);

            }catch(NumberFormatException e){

                System.out.println("Please select number");
                main(args);
                System.exit(0);
            }

        System.out.println(num + " + " + num2 + " = " + (num+num2));


    }
}
