class Person{
    private String name;

    public void setName(String value){
        this.name = value;
    }

    public String getName(){
        return name;
    }
}

public class PassByReference2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jaime");
    //wrapped classes are immutable whenever we modify the value we return a new instance
        System.out.println("person.getName(); = " + person.getName());

       test(person); //All objects except the method are passed with reference
        System.out.println("person.getName() = " + person.getName());
}
    /*an array can be passed by reference since it is also a pointer, so what the variable contains is the address*/
    public static void test(Person person) { //REFERENCE
        person.setName("Daniel");
    }
}