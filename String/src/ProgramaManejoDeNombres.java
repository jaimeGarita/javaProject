/*La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe*/

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + "Please select the name of a person who is a friend");
            String personA = scan.nextLine();
                String personA1 = personA.toUpperCase().charAt(1) + "." + personA.substring(personA.length()-2); //TODO EN MAYUSCULAS, ESCOGEMOS LA SEGUNDA LETRA Y COGEMOS LA ULTIMA PARTE

            String personB = scan.nextLine();
                String personB1 = personB.toUpperCase().charAt(1) + "." + personB.substring(personB.length()-2);
            String personC = scan.nextLine();
                String personC1 = personC.toUpperCase().charAt(1)+ "." +personC.substring(personB.length()-2);

        System.out.println(personA1+"_"+personB1+"_"+personC1);

    }
}
