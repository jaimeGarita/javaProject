import java.util.Scanner;

public class ExerciseArrayIncreaseSize {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int element, pos, last;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++){
            arr[i] = i;
            System.out.println("arr[i] = " + arr[i]);
        }
        System.out.println();

        System.out.println("New element: ");
        element = sc.nextInt();

        System.out.println("Position: ");
        pos = sc.nextInt();

        last = arr[arr.length - 1];

        for(int i = arr.length-2; i>=pos ; i--){
            arr[i+1] = arr[i];
        }
        int[] arrcpy = new int[arr.length+1];
        System.arraycopy(arr, 0, arrcpy, 0, arr.length);
        arrcpy[pos] = element;

        arrcpy[arrcpy.length -1 ] = last;

        for (int i = 0; i<arr.length; i++){
            System.out.println(arrcpy[i]);
        }
    }
}
