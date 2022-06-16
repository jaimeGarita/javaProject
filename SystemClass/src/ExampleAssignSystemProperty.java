import java.io.FileInputStream;
import java.util.Properties;

public class ExampleAssignSystemProperty {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/config2.properties"); //read the file and get the content in a byte form
            Properties p = new Properties(System.getProperties()); //Properties we need add all system configuration and add new configuration
            p.load(file); //We need load all config in the file object
            p.setProperty("my.personality.property","my value save in the property object");


            System.setProperties(p);
            System.getProperties().list(System.out);

            Properties ps= new Properties(System.getProperties()); //Properties we need add all system configuration and add new configuration
            System.out.println("ps.getProperty(\"config.author.email\") = " + ps.getProperty("config.author.email"));

        } catch (Exception e){ //All exception
            System.err.println("file not found = " + e); //ERROR
            System.exit(1);
            //(esp) es algo simiilar a las listas o mapas o diccionarios
        }
    }
}
