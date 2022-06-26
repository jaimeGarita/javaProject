import java.util.Scanner;

public class ExampleArraySearchNumber {
    public static void main(String[] args) {

        int[] num = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<num.length; i++){
            System.out.println("Add a number: ");
            num[i] = sc.nextInt();
        }

        System.out.println("\n Add a number to search in array: ");
        int a = sc.nextInt();
        int take = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i] == a){
                 take = num[i];
                System.out.println("the number you added " + take +  " is in the array int the " + i + " position");
                break;
            }
        }
        if(a != take){
            System.out.println("The number you added is not in the array");
        }
    }
}
