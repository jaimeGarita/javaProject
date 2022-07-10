public class Wheel {
    private String marker;
    private int rim;
    private double width;

    public Wheel(String marker, int rim, double width) {
        this.marker = marker;
        this.rim = rim;
        this.width = width;
    }

    public String getMarker() {
        return marker;
    }

    public int getRim() {
        return rim;
    }

    public double getWidth() {
        return width;
    }
}
