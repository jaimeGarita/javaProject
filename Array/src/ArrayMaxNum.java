import java.util.Random;

public class ArrayMaxNum {
    static final int cant = 5;
    public static void main(String[] args) {
        Random ran = new Random();

        Integer[] num = new Integer[cant];
        String[] numStr = new String[cant];

        for(int i = 0; i<cant;i++){
            numStr[i] = Integer.toString(ran.nextInt());
            String first = numStr[i];
            first = String.valueOf(first.charAt(1));
            numStr[i] = String.valueOf(first);

            num[i] = Integer.parseInt(numStr[i]);
            System.out.println(" = " +numStr[i]);
        }

        
        int max = 0;
        
        for(int i = 0; i<num.length; i++){
            if(max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("max = " + max);
    }


}
