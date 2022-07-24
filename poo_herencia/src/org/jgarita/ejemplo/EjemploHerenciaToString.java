package org.jgarita.ejemplo;

import org.jgarita.pooherencia.Alumno;
import org.jgarita.pooherencia.AlumnoInternacional;
import org.jgarita.pooherencia.Persona;
import org.jgarita.pooherencia.Profesor;


public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("========= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno("Jaime", "Garita", 21, "Salesianos");

        alumno.setNotaLengua(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("jaime@correo.com");
        /*CASTING
         * ((Alumno)alumno).setColegio("Salesianos")
         * Esto si la variable alumno es del tipo Persona, es decir de la padre
         * */
        System.out.println("=========== Creando la instancia de la clase Profesor ===============");
        Profesor profesor = new Profesor("Manolo", "El del bombo", "Matematicas");
        profesor.setEdad(40);

        System.out.println("========= Creando la instancia de la clase Alumno Internacional =========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Ghostlin", "Australia");

        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Lopez vicuna");
        alumnoInt.setNotaIdiomas(8.8);
        alumnoInt.setNotaLengua(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("===============");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("=================================");
        System.out.println(persona);
        System.out.println("=================================");
    }
}
