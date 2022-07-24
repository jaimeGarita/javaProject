package org.jgarita.ejemplo;
import org.jgarita.pooherencia.*;


public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos en comun del tipo persona");
        System.out.println("nombre: "+ persona.getNombre() + ", apellido: " + persona.getApellido() + ", edad: " + persona.getEdad() + ", correo: "+ persona.getEmail() );

        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del alumno: ");
            System.out.println("Colegio: " + ((Alumno) persona).getColegio());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota lengua: " + ((Alumno) persona).getNotaLengua());

            if(persona instanceof AlumnoInternacional){
                System.out.println("imprimiendo los datos del alumno internacional");
                System.out.println("Nora idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println(((AlumnoInternacional) persona).getPais());
            }
            System.out.println("============== sobre escritura promedio===============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("=======================================================");


        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("============== sobre escritura ===============");
        System.out.println(persona.saludar());
        System.out.println("===============================================");
    }
}
