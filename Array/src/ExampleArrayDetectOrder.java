import java.util.Scanner;

public class ExampleArrayDetectOrder {
    public static void main(String[] args) {
        int[] num = new int[7];

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert 7 number");

        for(int i = 0; i< num.length;i++){
            num[i] = sc.nextInt();
        }
        boolean asc = false;
        boolean desc = false;
        for(int i = 0; i<num.length-1; i++){
            if(num[i] > num[i+1]){
               desc = true;
            }
            else if(num[i] < num[i+1]){
                asc = true;
            }

        }

        if(asc == true && desc == true){
            System.out.println("Random Ordered");
        }
        if(asc == false && desc == false){
            System.out.println("Equal Ordered");
        }
        if(asc == false && desc == true){
            System.out.println("is ordered from largest to smallest");
        }
        if(asc == true && desc == false){
            System.out.println("is ordered from smallest to largest");
        }

    }
}
