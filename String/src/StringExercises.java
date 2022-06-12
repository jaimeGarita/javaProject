import javax.swing.*;

public class StringExercises {

    public static void main(String[] args) {

        String optPanel = JOptionPane.showInputDialog(null, "\n" + "give me a phrase that contains, please, your name in capital letters");
        //int number = optPanel.length();
        String[] opt = optPanel.split(" "); //STRING[] ES UNA LISTA DE ARRAY
        String name = "";
        for (String word:opt) { //foreach recorre una lista
            if(Character.isUpperCase(word.charAt(0))) { //el primer caracter esta en mayuscula imprime

                name = word;
            }
        }

                System.out.println("name = " + name);

            int capacity = name.length();
                System.out.println("capacity = " + capacity);

            System.out.println("first letter =  " + name.charAt(0));
            System.out.println("Last letter = " + name.substring(name.length() - 1));

        
        }
}

