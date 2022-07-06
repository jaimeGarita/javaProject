public class ExampleCar {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", "720", "Blue", 10, 30);

        System.out.println(car.showDetails());
        System.out.println(car.accelerate(100));
        System.out.println(car.curb());



    }
}
