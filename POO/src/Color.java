public enum Color {
    RED("Red"),
    BLANK("Blank"),
    YELLOW("Yellow"),
    PURPLE("Purple"),
    GREEN("Green");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
