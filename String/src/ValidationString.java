import java.util.Locale;

public class ValidationString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String curse = null; //IF THE INSTANCE IS EQUAL NULL IT WILL SEND US AN ERROR "NullPointerException"
        
        boolean isNull = curse == null;
        System.out.println("isNull = " + isNull);

        if(curse == null) {
            curse = "Programation Java";//Java programation;
        }

        boolean isEmpty = curse.length() == 0;

        System.out.println("isEmpty = " + isEmpty);

        boolean isEmpty2 = curse.isEmpty(); //IS THE SAME OF THE LINE 15 BECAUSE THE METHOD EVALUATE IF IT IS EMPTY

        boolean isWhite = curse.isBlank(); //IT IS MORE POWERFUL THAN EMPTY, VALID THAT IT IS DIFFERENT FROM NULL, THAT EMPTY AND THAT IT HAS CONTENT THAT IS DIFFERENT FROM A BLANK SPACE
                                           // (ESP)  ES MAS POTENTE QUE EL EMPTY, VALIDA QUE SEA DISTINTO NULL, QUE EMPTY Y QUE TENGA CONTENIDO QUE SEA DISTINTO QUE UN ESPACIO EN BLANCO, ES MAS SEGURA
        if(isWhite == false){
            System.out.println(curse.toLowerCase()); //Error null
            System.out.println(sb.append(curse).append(" zero!")); //PRINT NULL CERO
        }
    }
}
