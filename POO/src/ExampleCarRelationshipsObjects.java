

public class ExampleCarRelationshipsObjects {
    public static void main(String[] args) {
        Engine carEngine = new Engine(3.0, TypeEngine.GASOLINE);
        Wheel[] wheelLambo = new Wheel[10];
        Person bea = new Person("Beatriz", "Gonzalez");

        Person lamborghiniConductor = new Person("Luci", "Martinez");

        Car car = new Car("Ferrari", "720", Color.BLANK,  new Engine(carEngine), new Deposit());
        Car lamborghini = new Car("Lamborghini", "Urus", Color.RED, new Engine(4.0, TypeEngine.GASOLINE), new Deposit() );
        lamborghini.setOwner(lamborghiniConductor);
        //lamborghini.setWheels(wheelLambo);

        car.setOwner(bea);
        car.addWheel(new Wheel("Pirelli", 20, 11.4))
        .addWheel(new Wheel("Pirelli", 20, 11.4))
        .addWheel(new Wheel("Pirelli", 20, 11.4))
        .addWheel(new Wheel("Pirelli", 20, 11.4));

        for (int i = 0; i<wheelLambo.length; i++) {
            lamborghini.addWheel(new Wheel("Pirelli", 16, 2));
        }


        Person pato = new Person("Pato", "Rodriguez");
       car.setOwner(pato);

        System.out.println(lamborghini.getOwner());
        System.out.println(lamborghini.showDetails());
        System.out.println("Wheel lambo");

        for (Wheel r: lamborghini.getWheels()) {
            System.out.println(r.getMarker() + ' ' + r.getRim() + ' ' + r.getWidth());
        }


    }
}
