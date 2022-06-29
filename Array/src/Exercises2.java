import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int mayor = 0;

        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 11 || arr[i] > 99){
                System.err.println("Only elements range 11 - 99");
                main(args);
            }

        }
        for(int i = 0; i<arr.length; i++){
            mayor = (mayor < arr[i]) ? arr[i] : mayor;
        }
        System.out.println("the largest number is");
        System.out.println(mayor);
    }
}
