package es.jgarita.poo_sobrecarga;

public class Calculadora {

    public int sumar(int a, int b){
        return a+b;
    }

    public float sumar(float a , int b){
        return a+b;
    }

    public float sumar(int a, float b){
        return a+b;
    }

    public float sumar(float i, float j){
        return i+j;
    }

    public double sumar(double a, double b){
        return a+b;
    }

    public int sumar(String a, String b){
        return Integer.parseInt(a)+Integer.parseInt(b);
    }

    public int sumar(int a, int b, int c){
        return a+b+c;
    }
}
