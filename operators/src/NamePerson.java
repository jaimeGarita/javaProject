/*Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.

Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/


import javax.swing.*;

public class NamePerson {
    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de tu amigo");
        String p2 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de tu amigo");
        String p3 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de tu amigo");

        String max = (p1.split(" ")[0].length() < p2.split(" ")[0].length()) ? p2 : p1;
        max = (p3.split(" ")[0].length() < max.split(" ")[0].length()) ? max : p3;
        System.out.println("La persona con el nombre mas largo es " + max);


    }
}
