import java.util.Scanner;

public class ArrayDisplacementInPositionIndicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int pos = 0;
        int cant = 0;


        for (int i = 0; i<arr.length-1; i++){
            arr[i] = i;
        }

        System.out.print("Select the position of the array to place: ");
        pos = sc.nextInt();

        System.out.print("select the number to add in the position: ");
        cant = sc.nextInt();


        for(int i=arr.length-2 ; i>=pos ; i--){
            arr[i+1] = arr[i];
        }

        arr[pos] = cant;

        for(int i = 0; i<arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
        }

    }
}
