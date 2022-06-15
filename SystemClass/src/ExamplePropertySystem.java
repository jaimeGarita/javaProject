import java.util.Date;
import java.util.Properties;

public class ExamplePropertySystem {
    public static void main(String[] args) {

        String username = System.getProperty("user.name"); //Show the name of OS
        System.out.println("so = " + username);
        
        String home = System.getProperty("user.home"); //Show the user home dir
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir"); //Show the dir that you work it
        System.out.println("workspace = " + workspace);

        String javaVersion = System.getProperty("java.version"); //Show the Java version
        System.out.println("javaVersion = " + javaVersion);

        //Date date = new Date();
        String lineSeparator = System.getProperty("line.separator"); //"\n" but is slower than "\n"
        System.out.println("lineSeparator "  + lineSeparator + " newline");
        //Date date2 = new Date();
        //long finalTime =  date2.getTime() - date.getTime();

        //System.out.println("finalTime = " + finalTime);
        //Date date3 = new Date();
        System.out.println("lineSeparator" + "\n" + "newline");
        //Date date4 = new Date();
        //long finalTime2 = date4.getTime() - date3.getTime();
        //System.out.println("finalTime2 = " + finalTime2);

        Properties p = System.getProperties();
        p.list(System.out); //It shows us on the screen as if it were a list of all the options

    }
}
