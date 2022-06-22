import java.util.Random;

public class BubbleSortInt {
    public static void main(String[] args) {
        int[] num = new int[4];
        int total = num.length;
        
        Random ranObj = new Random();

        
        for(int i = 0; i<total; i++){
            int  rand= ranObj.nextInt();
            num[i] = rand;
            System.out.println("num[i] = " + num[i]);
        }
        System.out.println("\n\n");

        for(int i = 0; i<total;i++){
            for(int j = 0; j<total-1-i; j++){
                if(num[j+1] > num[j]) {
                    int aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                }

            }
            System.out.println("num[i] = " + num[i]);
        }
        System.out.println("\n\n");
        //Other solution
        Integer[] num2 = new Integer[4];
        for(int i = 0; i<num2.length; i++) {
            int rand = ranObj.nextInt();
            num2[i] = rand;
            System.out.println("num2[i] = " + num2[i]);
        }
        System.out.println("\n\n");

        for(int i = 0; i<num2.length; i++){
            for(int j = 0; j<num2.length-1-i;j++){
              if(num2[j+1].compareTo(num2[j]) > 0){
                  int aux = num2[j];
                  num2[j] = num2[j+1];
                  num2[j+1] = aux;

              }

            }
            System.out.println("num2[i] = " + num2[i]);
        }

    }
}
