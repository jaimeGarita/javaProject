package es.jgarita.poo_sobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    /*PARA MAS DE DOS ELEMENTOS, NO HACE FALTA CREAR UNA FUNCION POR CADA FUNCION*/
    public static int sumar (int... argumentos){
        int total = 0;

        for (int i : argumentos){
            total +=i;
        }
        return total;
    }


    public static float sumar (float... argumentos){
        float total = 0;

        for (float i : argumentos){
            total +=i;
        }
        return total;
    }

    public static double sumar (double... argumentos){
        double total = 0;

        for (double i : argumentos){
            total +=i;
        }
        return total;
    }

    public static int sumar(int a, int b){
        return a+b;
    }

    public static float sumar(float a , int b){
        return a+b;
    }

    public static float sumar(int a, float b){
        return a+b;
    }

    public static float sumar(float i, float j){
        return i+j;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public static int sumar(String a, String b){
        return Integer.parseInt(a)+Integer.parseInt(b);
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }
}
