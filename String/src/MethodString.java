import java.util.Locale;

public class MethodString {
    public static void main(String[] args) {

        String nombre = "Jaime";

        System.out.println("nombre.length() = " + nombre.length()); //Size of the String
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //All the string happens to be Uppercase
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //All the string happens to be LowerCase

        System.out.println("nombre.equals(\"Jaime\") = " + nombre.equals("Jaime")); //return true
        System.out.println("nombre.equals(\"jaime\") = " + nombre.equals("jaime")); //return false

        System.out.println("nombre.equalsIgnoreCase(\"jaime\") = " + nombre.equalsIgnoreCase("jaime")); //return True because ignore Case

        System.out.println("nombre.compareTo(\"Jaime\") = " + nombre.compareTo("Jaime")); //Compara en la tabla unicode y lo va ordenando
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); //Devuelve un int

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //RETURN THE CHARACTER THAT YOU CHOOSE

        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabajalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", ".")); //changes the target to replacement
        System.out.println("trabalenguas = " + trabalenguas);

        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a')); //Search the first character or string that you add and return the position for this character
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('t')); //Search the las character or string that you add and return the position for this character

        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); //Always is a String return true o false if you have what it contains

        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));

        System.out.println("  trabalenguas ".trim());



    }
}
