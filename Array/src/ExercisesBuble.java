import java.util.Scanner;

public class ExercisesBuble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount ");
        int cant = sc.nextInt();
        
        Integer[] array = new Integer[cant];
        
        for(int i = 0; i<array.length ; i++){
                System.out.println("Enter the number ");
                array[i] = sc.nextInt();
            }

        for(int i = 0; i<array.length ; i++){
            System.out.println("array[i] = " + array[i]);
        }

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length-1-i; j++){
                if((Integer)array[j].compareTo(array[j+1]) < 0 ){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0; i<array.length ; i++){
            System.out.println("array[i] = " + array[i]);
        }
        
    }
}
