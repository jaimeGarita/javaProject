public class MethodStringArray {
    public static void main(String[] args) {
        
        String trabalenguas = "trabajalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        
        char[] array = trabalenguas.toCharArray();
        int large = array.length; //LENGTH IN ARRAY IS ATTRIBUTE
        for(int i = 0; i<large; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println("trabalenguas = ");
        String[] array2 = trabalenguas.split("a"); //A IS DELIMITER, PRINT ALL MINUS A
        
        int l = array2.length;
        
        for(int j = 0; j<l; j++){
            System.out.println(array2[j]);
        }

        String file = "alguna_imagen.pdf";
        String fileArr[] = file.split("[.]");
        l = fileArr.length;
        for(int j= 0; j<l; j++) {
            System.out.println(fileArr[j]);
        }

        //System.out.println("filArr[l-1]);e = " + filArr[l-1]);

    }
}
