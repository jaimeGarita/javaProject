import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ExampleJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Add date with format 'yyyy-MM-dd' ");
        try {

            Date date = format.parse(sc.next());
            System.out.println("date = " + date);
            System.out.println("format = " + format.format(date));

            Date date2 = new Date();

            if (date.after(date2)) {
                System.out.println("user's date is after date2 (actual)");
            } else if (date.before(date2)) {
                System.out.println("user's date is before than date 2");
            } else if (date.equals(date2)) {
                System.out.println("user's date is equal than date2");
            }

            if (date.compareTo(date2) > 0) {
                System.out.println("user's date is after date2 (actual)");
            } else if (date.compareTo(date2) < 0) {
                System.out.println("user's date is before than date 2");
            } else if (date.compareTo(date2) == 0) {
                System.out.println("user's date is equal than date2");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
