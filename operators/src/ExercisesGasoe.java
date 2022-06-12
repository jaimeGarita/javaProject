
/*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
        Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque  3/4
   */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercisesGasoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gasoil  = 0.0;
            try {

                System.out.println("Please enter your gasoil");
                gasoil = sc.nextDouble();
            }catch (InputMismatchException e){
                System.out.println(" error");
                main(args);
                System.exit(1);
            }

            if(gasoil > 70){
                System.out.println("Error you break the deposit");
                main(args);
                System.exit(1);
            }

        if(gasoil > 60 | gasoil < 70){
            System.out.println(" Warning you have a full tank");
        } else if (gasoil > 40 | gasoil < 60) {
            System.out.println("3/4");
        } else if (gasoil > 35 | gasoil < 40) {
            System.out.println("2/1");
        }


    }
}
