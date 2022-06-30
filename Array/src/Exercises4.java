import java.util.Scanner;

public class Exercises4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] numRep = new int[arr.length];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            int repe = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    repe++;
                }
            }
            numRep[i] = repe;
        }


        int repNum = 0;

        for(int i = 0; i<numRep.length; i++){
            if(repNum < numRep[i]){
                repNum = numRep[i];
            }
        }

        int max = 0;
        int indice = 0;

        for(int i = 0; i<numRep.length; i++){
            if(max < numRep[i]){
                max = arr[i];
                indice = i;
            }
        }
        System.out.println("\n");
        System.out.println("The number repeates is: " + arr[indice]);
        System.out.println("The number is repeated: " +repNum);
    }
}
