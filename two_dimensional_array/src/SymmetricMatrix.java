public class SymmetricMatrix {
    static int dim = 4;
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean simetric = true;
        int i, j;
        i=0;
        while (i < arr.length && simetric == true) {
            j=0;
            while(j < i && simetric == true){
                if(arr[i][j] != arr[j][i]){
                    simetric = false;
                }
                j++;
            }
            i++;
        }
        System.out.println("simetric = " + simetric);
    }
}
