

public class ExampleCarStatic {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "720", Color.BLANK, 10, 30);
        Car car2 = new Car("Ferrari", "720", Color.RED, 10, 30);

        Car.setDefaultColor(Color.YELLOW);

        car2.setType(CarTypes.HATCHBACK);
        car.setType(CarTypes.COUPE);

        CarTypes carTypes = car.getType();
        System.out.println("Subaru type: " + carTypes.getName());
        System.out.println("Subaru type: " + carTypes.getDescription());

        Car car3 = new Car();

        car.setColor(Color.BLANK);
        car2.setColor(Color.GREEN);

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
