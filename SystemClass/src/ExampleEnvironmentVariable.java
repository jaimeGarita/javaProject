import java.util.Map;

public class ExampleEnvironmentVariable {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnvironment = "+ varEnv);

        System.out.println("Listing system environment variables");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        String UserName = System.getenv("USERNAME");
        System.out.println("UserName = " + UserName);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path"); //(ESP) Es un diccionario, por lo cual no
        System.out.println("path = " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV"); //(ESP) Es un diccionario, por lo cual no
        System.out.println("path = " + appEnv);


        String hello = varEnv.get("SALUDATE_HELLO"); //(ESP) Es un diccionario, por lo cual no
        System.out.println("hello = " + hello);



    }
}
