import javax.swing.*;
import java.io.IOException;
import java.util.Locale;

public class ExampleExecuteProgramOS {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;
        String osStr = JOptionPane.showInputDialog(null, "Write you OS");

            try {
                if (System.getProperty("os.name").toLowerCase().startsWith(osStr)) {
                    proceso = rt.exec("notepad");
                }else{
                    proceso = rt.exec("gedit");
                }
                proceso.waitFor();
                }
             catch (Exception e) {
             System.err.println("The command is unkno " + e.getMessage());
            }
        System.out.println("the notepad whas close");
        }
    }

