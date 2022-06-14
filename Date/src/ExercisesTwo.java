import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercisesTwo {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("MM");
        /*ACTUAL DATE*/
        Date actual = new Date();

        int now = Integer.parseInt(df.format(actual));
        System.out.println("now = " + now);

        int nextYear = 12 - now;
        System.out.println("nextYear = " + nextYear);
    }
}
