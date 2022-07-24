package org.jgarita.pooherencia;

import org.jgarita.pooherencia.Persona;

public class Alumno extends Persona {
    private String colegio;
    private double notaMatematica;
    private double notaLengua;
    private double notaHistoria;


    public Alumno(/*String nombre*/){ //invoca el constructor de persona
        //super(nombre); //siempre va antes que cualquier otra cosa, es lo primero que se invoca, si se omite llama al constructor del padre sin parametros
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String colegio){
        super(nombre, apellido, edad);
        this.colegio = colegio;
    }

    public Alumno(String nombre, String apellido, int edad, String colegio, double notaMatematica, double notaLengua, double notaHistoria) {
        this(nombre, apellido, edad, colegio);

        this.notaMatematica = notaMatematica;
        this.notaLengua = notaLengua;
        this.notaHistoria = notaHistoria;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override //indicamos sobreescritura
    public String saludar(){
        String saludar = super.saludar(); //llamamos al metodo padre
        return saludar + " soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        System.out.println("calcular Promedio " + Alumno.class.getCanonicalName());
        return (notaHistoria + notaLengua + notaMatematica) /3;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\n colegio='" + colegio + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaLengua=" + notaLengua +
                ", notaHistoria=" + notaHistoria +
                ", promedio= " + this.calcularPromedio();
    }
}
