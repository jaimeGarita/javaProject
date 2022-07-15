package es.jgarita.app.jardin;
import es.jgarita.app.hogar.Persona;

public class Perro {

     protected String nombre;
     protected String raza;

     String jugar(Persona persona){
          return persona.lanzarPelota();
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getRaza() {
          return raza;
     }

     public void setRaza(String raza) {
          this.raza = raza;
     }
}
