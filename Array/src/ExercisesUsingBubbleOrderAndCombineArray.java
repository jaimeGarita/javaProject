import java.util.Scanner;




public class ExercisesUsingBubbleOrderAndCombineArray {
    public static void array3(Object[] combined, Object[] arr, Object[] arr2) {
        int aux = 0;
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 0; j < 2; j++) {
                combined[aux++] = arr[i + j];
            }
            for (int j = 0; j < 2; j++) {
                combined[aux++] = arr2[i + j];
            }
        }
    }

    public static void prinNumber(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }

    public static void scannNumber(Object[] arr) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = sc.nextInt();
            } catch (Exception e) {
                System.err.println("Please enter number");
                System.exit(1);
            }
        }
    }

    public static void buble(Integer[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j].compareTo(arr1[j + 1]) < 0) {
                    int aux = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = aux;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr1 = new Integer[10];
        Integer[] arr2 = new Integer[10];

        Integer[] combined = new Integer[arr1.length + arr2.length];

        scannNumber(arr1);
        buble(arr1);
        prinNumber(arr1);

        scannNumber(arr2);
        buble(arr2);
        prinNumber(arr2);

        array3(combined, arr1, arr2);

        System.out.println("\n\n");
        for (int i = 0; i < combined.length; i++) {
            System.out.println("combined[i] = " + combined[i]);
        }
    }
}


