public class bidimensionalX {
    static int tam = 5;
    public static void main(String[] args) {
        String[][] arr = new String[tam][tam];

        for(int i = 0; i<tam ; i++){
            for(int j = 0 ; j<tam; j++){
                if(j == i){
                    arr[i][j] = "*";
                }else{
                    arr[i][j] = " ";
                }

                if(i+j == tam - 1) {
                    arr[i][j] = "*";
                }
            }
        }



        for(int i = 0; i<tam ; i++){
            System.out.println();
            for(int j = 0 ; j<tam; j++){
                System.out.print(arr[i][j]);

                }
            }
        }

    }

