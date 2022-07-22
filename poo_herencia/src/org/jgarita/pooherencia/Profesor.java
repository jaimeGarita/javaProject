package org.jgarita.pooherencia;
//java no soporta herencia multiple, probado por mi :D
public class Profesor extends Persona{
    private String asignatura;


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
