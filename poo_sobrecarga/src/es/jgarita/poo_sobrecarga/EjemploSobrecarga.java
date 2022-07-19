package es.jgarita.poo_sobrecarga;

import static es.jgarita.poo_sobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int: " + sumar(10,5));
        System.out.println("Sumar float: " + sumar(10.0F,5F));

        System.out.println("sumar float-int " + sumar(10f, 5));

        System.out.println("sumar mas de 3 elementos" + sumar(1,2,3,4,5,6,7));
        System.out.println("suma float + n int" + sumar(10.5F, 5,9,15));
        System.out.println("Suma 3 double" + sumar(5.9,5.6,5.6,5.8));
    }
}
