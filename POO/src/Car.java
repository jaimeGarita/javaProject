public class Car {

     private String maker;
     private String model;
     private String color = "Grey";
     private double cylinder;
     private int capacity = 40;

     public Car(String maker, String model) {
          this.maker = maker;
          this.model = model;
     }

     public Car(String maker, String model, String color) {
          this(maker, model);
          this.color = color;
     }

     public Car(String maker, String model, String color, double cylinder) {
          this(maker, model, color);
          this.cylinder = cylinder;
     }

     public Car(String maker, String model, String color, double cylinder, int capacity) {
          this(maker, model, color, cylinder);
          this.capacity = capacity;
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

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public double getCylinder() {
          return cylinder;
     }

     public void setCylinder(double cylinder) {
          this.cylinder = cylinder;
     }

     public int getCapacity() {
          return capacity;
     }

     public void setCapacity(int capacity) {
          this.capacity = capacity;
     }

     public String showDetails(){

          return "this.maker = " + this.maker + "\n" +
                  "this.model = " + this.model + "\n" +
                  "this.color = " + this.color + "\n" +
                  "this.cylinder = " + this.cylinder + "\n";
     }

     public String accelerate(int rpm){
          return "the car " + maker + " accelerate to " + rpm;
     }

     public String curb(){
          return this.maker + " " + this.model + " curb! ";
     }

     public float calculateConsume(int km, float benzinePercentage){
          return km/(capacity*benzinePercentage);
     }

     public float calculateConsume(int km, int benzinePercentage){
          return km/(capacity*benzinePercentage);
     }
}