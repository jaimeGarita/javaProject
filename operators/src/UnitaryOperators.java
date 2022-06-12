import java.util.*;

public class UnitaryOperators {
    public static void main(String[] args) {

        int a = -5;
        int j = -a;
        System.out.println("j = " + j);

        int b = 5;
        int b1 = -b;
        System.out.println("b1 = " + b1);

        int f = -5;
        int f1 = -f;
        System.out.println("f1 = " + f1);

        int i = 2;
        int j1 = 4;
        int m = 3;
        boolean b4 = i == j1 || i == m && m == 3; // PRIMERO VA LOS AND Y LUEGO LOS ORS
    }
}
