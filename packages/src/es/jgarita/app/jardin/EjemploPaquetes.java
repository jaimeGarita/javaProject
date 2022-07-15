package es.jgarita.app.jardin;
import es.jgarita.app.hogar.*;

import static es.jgarita.app.hogar.Persona.*; //EL ASTERISCO NO CONSUME MAS AÑADIENDOLO QUE SIN AÑADIR
import static es.jgarita.app.hogar.ColorPelo.*;

public class EjemploPaquetes{
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Jaime");
        System.out.println(p.getNombre());
        p.setColorPelo(CAFE);


        Perro perro = new Perro(); //no import, same package

        perro.setNombre("Toby");
        String jugando = perro.jugar(p);

        System.out.println(jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
