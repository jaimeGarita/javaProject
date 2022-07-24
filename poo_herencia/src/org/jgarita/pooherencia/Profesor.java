package org.jgarita.pooherencia;
//java no soporta herencia multiple, probado por mi :D
public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: inicializando constructor...");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {

        return super.saludar() + " soy el profesor de " + getAsignatura() + " mi nombre es " + getNombre();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\n asignatura='" + asignatura + '\'';
    }
}
