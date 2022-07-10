public class Person {
    //No siempre hace falta getter y setter, podemos utilizar el toString

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        String details = " ";
        if (toString() != null) {
            details+= name + " " + surname;
        }
        return details;
    }
}
