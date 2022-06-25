public class OddAndEven {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] pair = new int[10];
        int[] odd = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i;
            System.out.println("num[i] = " + num[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pair[i] = num[i];
                System.out.println("pair[i] = " + pair[i]);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                odd[i] = num[i];
                System.out.println("odd[i] = " + odd[i]);
            }
        }
    }
}
