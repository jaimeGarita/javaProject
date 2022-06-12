public class WrapperOpRelational {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(127); //EXPLICIT
        Integer num2 = num1;
        //OBJECT VALUE
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("They are the same object? " + (num1 == num2)); //(ESP) SON DOS OBJETOS QUE ESTAN ASIGNADOS A DOS VARIABLES

        num2 = 127; //(ESP) JAVA COMPARA LOS VALORES HASTA EL NUMERO 127  AUTOMATICAMENTE HCE EL AUTOBOXIN, PERO SOLAMENTE HASTA 127
        System.out.println("They are the same object? " + (num1 == num2)); //(ESP) CONTIENE EL MISMO VALOR PERO NO LA MISMA INSTANCIA, NO APUNTAN AL MISMO VALOR, POR LO CUAL AQUI COMPARAMOS DIRECCIONES DE MEMORIA

        System.out.println("(num1.equals(num2)) = " + (num1.equals(num2))); //COMPARATIVE THE VALUE

        System.out.println("(num1.intValue() == num2.intValue()) = " + (num1.intValue() == num2.intValue())); //COMPARATIVE THE VALUE PRIMITIVE

        num2 = 20;
        boolean condition = num1 > num2; //AUTOANBOXING REFERENCE TO PRIMITIVE
        System.out.println("condition = " + condition);
    }
}
