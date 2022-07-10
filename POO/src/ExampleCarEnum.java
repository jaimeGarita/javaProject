public class ExampleCarEnum {
    public static void main(String[] args) {
        Engine carEngine = new Engine(3.0, TypeEngine.GASOLINE);
        Car car = new Car("Ferrari", "720", Color.GREEN, new Engine(carEngine), new Deposit(50));
        Car car2 = new Car("Ferrari", "720", Color.PURPLE, new Engine(4.0, TypeEngine.GASOLINE), new Deposit(50));

        car.setEngine(new Engine(3.0, TypeEngine.DIESEL));
        car.setColor(Color.YELLOW);
        car.setType(CarTypes.SEDAN);
        
        Car mazda = new Car("Mazda", "BT-50", Color.RED, new Engine(3.0, TypeEngine.GASOLINE));
        mazda.setType(CarTypes.PICKUP);
        System.out.println("mazda.getMaker() = " + mazda.getMaker());
        
        CarTypes typeCar = car.getType();
        System.out.println("typeCar.getName() = " + typeCar.getName());
        System.out.println("typeCar.getDescription() = " + typeCar.getDescription());

        typeCar = mazda.getType();
        switch (typeCar){
            case CONVERTIBLE -> System.out.println("the car is sports and convertible with two doors");
            case COUPE -> System.out.println("It is a small two-door and typically sports car");
            case VAN -> System.out.println("It is a utility car for transport, for companies");
            case HATCHBACK -> System.out.println("It is a compact midsize car, sports aspects");
            case PICKUP -> System.out.println("is it a double cab car or van");
            case SEDAN -> System.out.println("it is a medium car");
            case STATION_WAGON -> System.out.println("It is a bigger car, with a big trunk.");
        }

        CarTypes[] types = CarTypes.values(); //VALUE RETURN ENUM ARRAY

        for (CarTypes tc : types) {

            System.out.print(tc + " => " + tc.name() + ", " +
                    tc.getName() + ", " +
                    tc.getDescription() + ", " +
                    tc.getnDoors());

            System.out.println();
        }

    }
}
