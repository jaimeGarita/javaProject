import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] media = new int[7];
       int nPositive=0;
       int nNegative=0;
       int conPositive=0;
       int conNegative=0;
       int contZero=0;

       for (int i = 0; i<media.length; i++) {
           System.out.print("Add number: ");
           media[i] = sc.nextInt();
       }

       for(int i = 0; i<media.length; i++){

           if(media[i] == 0){
               contZero++;
           }

           if(media[i] > 0){
               nPositive += media[i];
               conPositive++;
           }

           if(media[i] < 0){
               nNegative += media[i];
               conNegative++;
           }
       }

       if(conPositive == 0){
           System.out.println("no negative numbers found");
       } else if (conPositive > 0) {
           System.out.println("Positive number media is " + (nPositive/conPositive));
       }

        if(conNegative == 0){
            System.out.println("no negative numbers found");
        } else if (conNegative > 0) {
            System.out.println("Negative number media is " + (nNegative/conNegative));
        }

        System.out.println("contZero = " + contZero);

    }
}
