import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //ABSTRACT CLASS AND WE NEED THE METHOD getInstance

        //calendar.set(2001, Calendar.NOVEMBER, 13, 07, 23, 11);
        calendar.set(Calendar.YEAR, 2002);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        calendar.set(Calendar.HOUR_OF_DAY, 7);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);
        Date date = calendar.getTime();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH");
        String dateStr = format.format(date);
        System.out.println("dateStr = " + dateStr);
    }
}
