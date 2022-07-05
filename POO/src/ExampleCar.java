public class ExampleCar {
    public static void main(String[] args) {

        Car car = new Car();

        car.maker = "Ferrari";
        car.model = "720";
        car.color = "Blank";
        car.cylinder = 200;

        System.out.println("car.maker = " + car.maker);
        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println("car.cylinder = " + car.cylinder);
    }
}
