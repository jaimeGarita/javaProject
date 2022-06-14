import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExerciseAgeUser {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birthday in this format 'dd-MM-yyyy' ");
        String userBirth = sc.next();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date birth = df.parse(userBirth);

        Date actual = new Date();

        df = new SimpleDateFormat("yyyyMMdd");

        int birthInt = Integer.parseInt(df.format(birth));
        int actualInt = Integer.parseInt(df.format(actual));

        int age = (actualInt - birthInt) / 10000;
        System.out.println("age = " + age);


    }
}
