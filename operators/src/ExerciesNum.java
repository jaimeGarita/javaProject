
/*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
 Podría ser utilizando operador ternario.*/

import java.util.Scanner;

public class ExerciesNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter one number");
        int num = sc.nextInt();
        System.out.println("Please enter other number");
        int num2 = sc.nextInt();

        boolean comprobar = (num > num2) ? true : false;

        if(comprobar){
            System.out.println(num + " > " + num2);
        }else {
            System.out.println(num2 + " > " + num);
        }
    }
}
