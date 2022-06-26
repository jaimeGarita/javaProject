import java.util.Scanner;

public class ExampleArrayDisplacementPosition {
    public static void main(String[] args) {

        int[] a = new int[10];
        int last = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<a.length; i++){
            System.out.print("Add number: ");
            a[i] = sc.nextInt();
        }
        System.out.println("\n");
        last = a[a.length-1];

        for (int i = a.length-2; i>=0; i--){
            a[i+1] = a[i];
        }

        a[0] = last;
        System.out.println("The array");
        for(int i = 0; i<a.length; i++){
            System.out.println("a[i] " + a[i]);
        }

    }
}
