/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar,
luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

        Calcular el menor número e imprimir el valor.

        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercisesOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cant = 0;
        try {
            System.out.println("Please introduce the amount you want to add, must be greater than 10 numbers");
            cant = sc.nextInt();
            if(cant<10){
                System.out.println("Warning you dont have selected the number greater than 10");
                main(args);
            }
        }catch (InputMismatchException e){
            System.out.println("Warning you add integer");
            main(args);
            System.exit(1);
        }
        int menor = Integer.MAX_VALUE;
        int num = 0;

        for(int i = 0; i<cant; i++){
            System.out.println("Select your " + i +" number ");
            num = sc.nextInt();

            menor = (num < menor) ? num : menor;

        }

        System.out.println("The number more little "+ menor);
    }
}
