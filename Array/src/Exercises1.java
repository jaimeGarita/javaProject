import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] order = new int[10];
        int aux;
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        aux = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[9 - i]); // y el i-ésimo por el final
            System.out.println(arr[i]); // mostramos el i-ésimo número por el principio
        }
    }
}
