public class StringTestPerformance {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //IS MUTABLE, WE CAN MODIFY

        long begin = System.currentTimeMillis();

        for(int i = 0; i< 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 => 2ms, 1000 => 4ms, 10000 =>133 ms, 100000 => 5605 ms
            //c+= a + b  + "\n"; // 500 => 14 ms ,1000 21ms, 10000 67 ms, 100000 => 1810 ms
            //sb.append(a).append(b).append("\n"); //500 => 0ms, 1000 => 0, 10000 => 2ms, 100000 => 8 ms

            //Append work with buffer
            //Concat create object example :
            /*
            * object 1 = c
            * object 2 = a
            * object 3 = b
            * object 4 = c + a + b
            * object 5 = c + a + b + "\n"
            * */

            //+ create one object for each String add example :
            /*
            * object 1 = a
            * object 2 = b
            * object 3 = "\n"
            * */


            /*POSITION*/
            //1.- append
            //2.- +
            //3.- concat
            System.gc();
        }

        long end = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " +sb.toString());
        System.out.println(end-begin);

        System.exit(0);
        /*Este ejemplo se crea muchos objetos String por lo cual se carga toda la memoria que tenemos*/
    }
}
