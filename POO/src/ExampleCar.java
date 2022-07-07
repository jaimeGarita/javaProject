import java.util.Date;

public class ExampleCar {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", "720", "Blue", 10, 30);
        Car car2 = new Car("Ferrari", "720", "Blue", 10, 30);
        Date date = new Date();

        Car car3 = new Car();
        System.out.println("car3 = " + car3);
        System.out.println("car2 = " + car2.toString());

        System.out.println(car.showDetails());
        System.out.println(car.accelerate(100));
        System.out.println(car.curb());


        System.out.println("Equal? = "+ (car == car2));
        System.out.println("Equal? = "+ (car.equals(car2)));

        System.out.println("Equal? = "+ (car.equals(car3)));
    }
}
