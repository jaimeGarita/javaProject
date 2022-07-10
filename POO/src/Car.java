import java.lang.annotation.Native;
import java.util.Arrays;

public class Car {
     private static int lastId;
     private int id;

     private String maker;
     private String model;
     private Color color = Color.GREEN;
     private Engine engine;
     private Deposit deposit;
     private Person owner;
     private Wheel[] wheels;

     private CarTypes type;

     @Native
     public static final int MAX_VELOCITY = 120; //CONST


     private static Color defaultColor = Color.BLANK;
     public Car(String maker, String model) {
          this.maker = maker;
          this.model = model;
     }

     public Car(String maker, String model, Color color) {
          this(maker, model);
          this.color = color;
     }

     public Car(String maker, String model, Color color, Engine engine) {
          this(maker, model, color);
          this.engine = engine;
     }

     public Car(String maker, String model, Color color, Engine engine, Deposit deposit) {
          this(maker, model, color, engine);
          this.deposit = deposit;
     }

     public Car() {
          this.id = lastId++;
     }

     public Car(String maker, String model, Color color, Engine engine, Deposit deposit, Person owner, Wheel[] wheels) {
          this(maker, model, color, engine, deposit);
          this.owner = owner;
          this.wheels = wheels;
     }

     //POJO = Plain Old Java Object
     public String getMaker() {
          return maker;
     }

     public void setMaker(String maker) {
          this.maker = maker;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public Color getColor() {
          return color;
     }

     public void setColor(Color color) {
          this.color = color;
     }

     public CarTypes getType() {
          return type;
     }

     public void setType(CarTypes type) {
          this.type = type;
     }

     public Engine getEngine() {
          return engine;
     }

     public void setEngine(Engine engine) {
          this.engine = engine;
     }

     public Deposit getDeposit() {

          if (deposit == null){
               this.deposit = new Deposit();
          }

          return deposit;
     }

     public void setDeposit(Deposit deposit) {
          this.deposit = deposit;
     }

     public Person getOwner() {
          return owner;
     }

     public void setOwner(Person owner) {
          this.owner = owner;
     }

     public Wheel[] getWheels() {
          return wheels;
     }

     public void setWheels(Wheel[] wheels) {
          this.wheels = wheels;
     }

     public String showDetails(){

          String details = "this.maker = " + this.maker + "\n" +
                  "this.model = " + this.model + "\n";
          if (getType() != null) {
               details += "Car.type = " + this.getType().getDescription();
          }

          details += "this.color = " + this.color.getColor() + "\n" +
                  "this.engine = " + engine.getType() + "\n";

          return details;
     }



     public String accelerate(int rpm){
          return "the car " + maker + " accelerate to " + rpm;
     }

     public String curb(){
          return this.maker + " " + this.model + " curbing! ";
     }

     public float calculateConsume(int km, float benzinePercentage){
          return km/(this.getDeposit().getCapacity()*benzinePercentage);
     }

     public float calculateConsume(int km, int benzinePercentage){
          return km/(this.getDeposit().getCapacity()*benzinePercentage);
     }

     public static Color getDefaultColor(){
          return defaultColor;
     }

     public static void setDefaultColor(Color defaultColor){
          Car.defaultColor = defaultColor;
     }
     @Override //WE INDICATE THE COMPILER AT RUNTIME THAT WE ARE OVERWRITING A PARENT CLASS METHOD, IT IS ADDITIONAL INFORMATION (ESP)INDICAMOS AL COMPILADOR EN TIEMPO DE EJEUCION QUE ESTAMOS SOBREESSCRIBIENDO UN METODO DE CLASE PADRE, ES INFORMACION ADICIONAL
     public boolean equals(Object obj) {
          if(this == obj){
               return true;
          }
          if(!(obj instanceof Car)){
               return false;
          }
          Car a = (Car)obj;
          return (this.maker.equalsIgnoreCase(a.getMaker()) && this.model.equalsIgnoreCase(a.getModel()));
     }

     @Override
     public String toString() {

          String details = "Car{" +
                  "id=" + id +
                  ", maker='" + maker + '\'' +
                  ", model='" + model + '\'' +
                  ", color=" + color;
                    if (engine.getType() != null) {
                        details += ", engine=" + engine.getType();
                    }
                 details += ", deposit=" + deposit.getCapacity();
               if(this.owner != null){
                    details += ", owner=" + owner.toString();
               }

               details+=  Arrays.toString(wheels) +
                  ", type=" + type +
                  '}';

          return details;
     }
}