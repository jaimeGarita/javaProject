import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleJavaUtilDate {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date = " + date);

        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-YY 'time' HH::mm::ss");
        String dateStr = df.format(date);

        System.out.println("dateStr = " + dateStr);


        Date date2 = new Date();

        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }

        System.out.println("j = " + j);
        long finalTime = date2.getTime() - date.getTime();
        System.out.println("finalTime = " + finalTime + "ms");

    }
}
