import java.util.Scanner;

public class ExampleArrayAddElementInAPosition {
    public static void main(String[] args) {
        int incr = 10;
        int num = 0;
        int pos = 0;

        int[] arr = new int[incr];

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i<arr.length-1 ; i++){
            arr[i] = i*4;
            System.out.println("arr[i] = " + arr[i]);
        }
        
        System.out.println("\n");
        num = sc.nextInt();

        for(int i = 0; i<arr.length-1 ; i++){
            if(num < arr[i]){
                pos = i;
                break;
            }
        }

              while(pos < 9 && num > arr[pos]){
            pos++;
        }

        for(int i = arr.length-2 ; i>=pos; i--){
          arr[i+1] = arr[i];
      }
            arr[pos] = num;


      for(int i = 0; i<arr.length; i++){
          System.out.println("arr = " + arr[i]);
      }
    }
}
