import java.util.Arrays;

public class ExampleCarArray {
    public static void main(String[] args) {

        Engine carEngine = new Engine(3.0, TypeEngine.GASOLINE);
        Wheel[] wheelLambo = new Wheel[10];
        Person bea = new Person("Beatriz", "Gonzalez");
        Person paco = new Person("Paco", "Ramirez");

        Person lamborghiniConductor = new Person("Luci", "Martinez");

        Car car = new Car("Ferrari", "720", Color.BLANK,  new Engine(carEngine), new Deposit());
        Car lamborghini = new Car("Lamborghini", "Urus", Color.RED, new Engine(4.0, TypeEngine.GASOLINE), new Deposit() );
        Car audi = new Car("Audi", "A3");
        Person jano = new Person("jano", "perez");
        audi.setOwner(jano);
        lamborghini.setOwner(lamborghiniConductor);
        car.setOwner(paco);
        //lamborghini.setWheels(wheelLambo);


        //Polimorfism
        Car[] cars = new Car[3];
        cars[0] = car;
        cars[1] = lamborghini;
        cars[2] = audi;

        Arrays.sort(cars);

        for (int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
