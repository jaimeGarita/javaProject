

public class ExampleCarStatic {
    public static void main(String[] args) {
        Engine carEngine = new Engine(3.0, TypeEngine.GASOLINE);

        Car car = new Car("Ferrari", "720", Color.BLANK,  new Engine(carEngine), new Deposit());
        Car lamborghini = new Car("Lamborghini", "Urus", Color.RED, new Engine(4.0, TypeEngine.GASOLINE), new Deposit());

        Car.setDefaultColor(Color.YELLOW);

        lamborghini.setType(CarTypes.HATCHBACK);
        car.setType(CarTypes.COUPE);

        CarTypes carTypes = car.getType();
        System.out.println("Subaru type: " + carTypes.getName());
        System.out.println("Subaru type: " + carTypes.getDescription());

        lamborghini.setDeposit(new Deposit(40));


        car.setColor(Color.BLANK);
        lamborghini.setColor(Color.GREEN);

        System.out.println(car.showDetails());
        System.out.println(car.accelerate(100));
        System.out.println(car.curb());

        System.out.println("================");
        System.out.println(lamborghini.showDetails());
        System.out.println(lamborghini.accelerate(100));
        System.out.println(lamborghini.curb());

        System.out.println("Car.getDefaultColor() = " + Car.getDefaultColor());
        
        
        CarTypes lamborghiniType = lamborghini.getType();
        System.out.println("lamborghiniType = " + lamborghiniType.getName());

        System.out.println(lamborghini.calculateConsume(300,70));
    }
}
