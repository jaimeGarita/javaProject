public class BubbleSort {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB","Samsung Galaxy","Disk hard SSD Samsung Extern","Asus Notebook","Macbook Air","Chromecast 4 generation","Bike oxford"};

        int total = productos.length;

        int cont = 0;
        for(int i = 0; i<total; i++){
            for(int j = 0; j< total-1-i; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){ //if we compare one String to another and is >0 the letter is so bigger than other
                    String aux = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = aux;
                }
                cont++;
            }
        }
        System.out.println("cont = " + cont);
        for (int i = 0; i<total; i++){
            System.out.println("productos[i] = " + productos[i]);
        }
        
    }
}
