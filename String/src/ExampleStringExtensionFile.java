public class ExampleStringExtensionFile {
    public static void main(String[] args) {
        String file = "alguna.imagen.jpeg";
        System.out.println("file.length() = " + file.length());
        int i = file.lastIndexOf(".");
        System.out.println("file.substring(14) = " + file.substring(i+1)); //STATIC MODE

    }
}
