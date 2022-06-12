public class HelloWorldVariable {


    public static void main(String[] args) {

        String saludate = "Hello World from Java!"; //CLASS STRING CAN BE ASSIGNED VALUES AS IF IT WERE A PRIMITIVE DATA TYPE
        System.out.println(saludate);
        System.out.println("saludate = " + saludate); //WE CAN USE THE "soutv" SHORTCUT, THIS SHORTCUT PRINT THE FIRST VARIABLE, IF YOU ONLY NEED USE System.out.println CAN USE sout

        System.out.println("saludate = " + saludate.toUpperCase()); //SALUDATE HAVE METHOD TO CHANGE TE STRING VALOR, FOR EXAMPLE toUpperCase use to PRINT ALL STRING IN UPPERCASE

        /*PRIMITIVE VARIABLES*/

        int num = 1; //32 Bits
        boolean valor = true;

        System.out.println("\nnum = " + num);

        //FLEXIBLE VARIABLES
        var felxible = 10;
        System.out.println("felxible = " + felxible);

        /*RULES TO DEFINE VARIABLE*/

        int oldPerson; //Camel case
        int old_Person; //Snake case




    }
}

