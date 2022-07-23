package org.jgarita.ejemplo;


import org.jgarita.pooherencia.*;


public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        System.out.println("========= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno("Jaime", "Garita", 21, "Salesianos");

        alumno.setNotaLengua(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
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


        System.out.println("===============");


    }

    public static void imprimir(Persona persona){
        System.out.println("nombre: "+ persona.getNombre() + ", apellido: " + persona.getApellido() + ", edad: " + persona.getEdad() + persona.getEmail() );
        if (persona instanceof Alumno){
            System.out.println("Colegio: " + ((Alumno) persona).getColegio());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println();
        }
        //System.out.println(persona.getPais());

    }
}
