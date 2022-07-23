package org.jgarita.ejemplo;


import org.jgarita.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("========= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno();
        alumno.setNombre("Jaime");
        alumno.setApellido("Garita");
        alumno.setColegio("Salesianos");
        alumno.setNotaLengua(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        /*CASTING
        * ((Alumno)alumno).setColegio("Salesianos")
        * Esto si la variable alumno es del tipo Persona, es decir de la padre
        * */
        System.out.println("=========== Creando la instancia de la clase Profesor ===============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Manolo");
        profesor.setApellido("El del bombo");
        profesor.setAsignatura("Matematicas");

        System.out.println("========= Creando la instancia de la clase Alumno Internacional =========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Ghostlin");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Lopez vicuna");
        alumnoInt.setNotaIdiomas(8.8);
        alumnoInt.setNotaLengua(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);


        System.out.println("===============");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(profesor.getAsignatura() + " " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getColegio() + " " + alumnoInt.getPais());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();

            System.out.println(hija + " Es una clase hija de la clase padre " + padre);

            clase = clase.getSuperclass();
        }
    }
}
