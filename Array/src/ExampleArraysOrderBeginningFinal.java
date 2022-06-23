import java.util.Scanner;

public class ExampleArraysOrderBeginningFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int[] num2 = new int[10];

        for(int i = 0; i<num.length; i++){
            num[i] = i+1;
        }
        int aux = 0;
        for(int i = 0; i < num.length/2; i++){
            num2[aux++] = num[i];
            num2[aux++] = num[num.length-i-1];
            System.out.println("num[i] " + " num[num.length-i-1] = " + num[i] + " " + num[num.length-i-1]);
           
        }
        for(int i = 0; i<num2.length; i++){
            System.out.println("num2[i] = " + num2[i]);
        }
    }
}
