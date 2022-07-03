public class bidimensionalH {
    static int num = 10;
    public static void main(String[] args) {
        String[][] h = new String[num][num];

        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                if(j == 0){
                    h[i][j] = "*";
                }else{
                    h[i][j] = " ";
                }
                if(i == num/2){
                    h[i][j] = "*";
                }
                if(i > num/2 && j == num-1){
                    h[i][j] = "*";
                }

            }
        }
        for(int i = 0; i<num; i++) {
            System.out.println();
            for (int j = 0; j < num; j++) {
                System.out.print(h[i][j]);
            }
        }

    }
}
