import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] arr = new int[12];

       for(int i = 0; i<arr.length; i++){
           arr[i] = sc.nextInt();
       }

       String[] ast = new String[arr.length/2];

       for (int i = 0; i<ast.length; i++){
           int aux = i+1;
           String histogram = aux + ": ";
           for (int j = 0; j<arr.length; j++){
               if(arr[i] == arr[j]){
                   histogram += "*";
               }
           }
           ast[i] = histogram;
       }

       for (int i = 0; i<ast.length; i++){
           System.out.println(ast[i]);
       }
    }
}
