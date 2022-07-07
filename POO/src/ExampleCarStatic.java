
public class ExampleCarStatic {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", "720", "Blue", 10, 30);
        Car car2 = new Car("Ferrari", "720", "Yellow", 10, 30);

        Car.setDefaultColor("Pink");

        Car car3 = new Car();
        System.out.println("car3 = " + car3);
        System.out.println(car.showDetails());
        System.out.println(car.accelerate(100));
        System.out.println(car.curb());

        System.out.println("================");
        System.out.println(car2.showDetails());
        System.out.println(car2.accelerate(100));
        System.out.println(car2.curb());

        System.out.println("Car.getDefaultColor() = " + Car.getDefaultColor());

    }
}
