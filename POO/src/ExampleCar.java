import java.util.Date;

public class ExampleCar {
    public static void main(String[] args) {

        Engine carEngine = new Engine(3.0, TypeEngine.GASOLINE);

        Car car = new Car("Ferrari", "720", Color.GREEN, new Engine(carEngine), new Deposit(50));
        Car car2 = new Car("Ferrari", "720", Color.PURPLE, new Engine(4.0, TypeEngine.GASOLINE), new Deposit(50));
        Date date = new Date();

        car.setEngine(new Engine(2.0, TypeEngine.DIESEL));
        car.setDeposit(new Deposit()); //40

        Car car3 = new Car();
        System.out.println("----");
        System.out.println("car.showDetails() = " + car.showDetails());
        System.out.println("----");
        System.out.println("car2 = " + car2.toString());
        car3.getDeposit();


        System.out.println(car.showDetails());
        System.out.println(car.accelerate(100));
        System.out.println(car.curb());


        System.out.println("Equal? = "+ (car == car2));
        System.out.println("Equal? = "+ (car.equals(car2)));

        System.out.println("Equal? = "+ (car.equals(car3)));
    }
}
