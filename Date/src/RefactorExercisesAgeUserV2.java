import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RefactorExercisesAgeUserV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birthday in this format 'dd-MM-yyyy' ");
        String userBirth = sc.next();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date birth = null;

        try {
            birth = df.parse(userBirth);
        } catch (ParseException e) {
            main(args);
            throw new RuntimeException(e);
        }

        Date actual = new Date();

        df = new SimpleDateFormat("yyyyMM");

        int year = Integer.parseInt(df.format(birth));
        int actualYear = Integer.parseInt(df.format(actual));

        int age = (actualYear - year) / 100;

        df = new SimpleDateFormat("MM");
        int monthUser = Integer.parseInt(df.format(birth));
        int monthActual = Integer.parseInt(df.format(actual));

        int month = (monthUser - monthActual);
        System.out.println("month = " + month);


        System.out.println("age = " + age);


    }
}
