import java.lang.reflect.Method;

public class MethodGetClass {
    public static void main(String[] args) {

        String text = "Hello World!";

        Class strClass = text.getClass(); //getClass REDISCOVER INSIDE HOW THE OBJECT OR CLASS WORKS RETURN INSTANCE CLASS TYPE
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);
        
        for(Method m : strClass.getMethods()){
            System.out.println("m.getName() = " + m.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass);
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
    }
}
