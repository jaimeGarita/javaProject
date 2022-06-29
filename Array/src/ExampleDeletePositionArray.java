import java.util.Scanner;

public class ExampleDeletePositionArray {
    public static void main(String[] args) {
        int[] num = new int[10];
        int pos, cant;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<num.length;i++) {
            num[i] = i;
            System.out.println("num[i] = " + num[i]);
        }

        System.out.print("Select the position you are going to delete in the array: ");
        pos = sc.nextInt();

        for(int i = pos ; i<num.length-1;i++) {
            num[i] = num[i + 1];
        }
        for(int i = 0; i<num.length;i++) {
            System.out.println("num[i] = " + num[i]);
        }

    }
}
