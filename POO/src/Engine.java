public class Engine {
    private double displacement;
    private TypeEngine type;

    public Engine(double displacement, TypeEngine type) {
        this.displacement = displacement;
        this.type = type;
    }

    public Engine(Engine carEngine) {

    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public TypeEngine getType() {
        return type;
    }

    public void setType(TypeEngine type) {
        this.type = type;
    }
}

