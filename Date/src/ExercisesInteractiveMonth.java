import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercisesInteractiveMonth {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");


        try {
            String dateUser = JOptionPane.showInputDialog(null, "Please enter anyone age from this model 'dd-MM-yyyy'");
            Date date = df.parse(dateUser);

            df = new SimpleDateFormat("MM");

            int month = Integer.parseInt(df.format(date));
            int nextYear = 12 - month;
            System.out.println("nextYear = " + nextYear);

        } catch (ParseException e) {
            main(args);
            throw new RuntimeException(e);


        }
    }
}
