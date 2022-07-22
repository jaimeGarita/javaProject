package org.jgarita.ejemplo;


import org.jgarita.pooherencia.Alumno;
import org.jgarita.pooherencia.Persona;
import org.jgarita.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Jaime");
        alumno.setApellido("Garita");
        alumno.setColegio("Salesianos");
        /*CASTING
        * ((Alumno)alumno).setColegio("Salesianos")
        * Esto si la variable alumno es del tipo Persona, es decir de la padre
        * */

        Profesor profesor = new Profesor();
        profesor.setNombre("Manolo");
        profesor.setApellido("El del bombo");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(profesor.getAsignatura() + " " + profesor.getNombre() + " " + profesor.getApellido());
    }
}
