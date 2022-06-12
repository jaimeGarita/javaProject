public class CreationString {
    public static void main(String[] args) {
        String curse = "Java programation"; //REFERENCE CREATION OBJECT STRING
        String curse2 = new String("Java Programation"); //IS SAME OF REFERENCE BUT WE CAN CALL CONSTRUCTOR
        
        boolean isEqual= curse == curse2; //COMPARATION DIRECTION AND NO VALUE
        System.out.println("curse == curse2 = " + isEqual);
        
        /*METHOD EQUAL*/ //COMPARATION VALUE
        isEqual = curse.equalsIgnoreCase(curse2);
        System.out.println("curse.equalsIgnoreCase(curse2) = " + isEqual);
        
        /*DOES NOT CREATE A NEW OBJECT ASSIGN THE REFERENCE IT IS USED TO OPTIMIZE*/
        String curse3 = "Java programation";
        isEqual = curse3 == curse;
        System.out.println("curse3 == curse = " + isEqual);

        // FOREVER WE COMPARE WITH THIS curse.equalsIgnoreCase(curse2)


    }
}
