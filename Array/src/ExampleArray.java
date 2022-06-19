import java.lang.reflect.Array;
import java.util.Arrays;

public class ExampleArray {
    public static void main(String[] args) {

        String[] product = new String[7];
        product[0] = "Kingston Pendrive 64GB";
        product[1] = "Samsung Galaxy";
        product[2] = "Disk hard SSD Samsung Extern";
        product[3] = "Asus Notebook";
        product[4] = "Macbook Air";
        product[5] = "Chromecast 4 generation";
        product[6] = "Bike oxford";

        Arrays.sort(product);

        System.out.println("product[0] = " + product[0]);
        System.out.println("product[1] = " + product[1]);
        System.out.println("product[2] = " + product[2]);
        System.out.println("product[3] = " + product[3]);
        System.out.println("product[4] = " + product[4]);
        System.out.println("product[5] = " + product[5]);
        System.out.println("product[6] = " + product[6]);
    }
}
