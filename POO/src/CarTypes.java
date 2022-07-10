public enum CarTypes {
    SEDAN("Sedan", "Medium Car", 4),
    STATION_WAGON("Station Wagon", "Big Car", 5),
    HATCHBACK("Hatchback", "Compact Auto", 4),
    PICKUP("Pickup", "Van", 4),
    COUPE("Coupe", "Small Car", 2),
    CONVERTIBLE ("Convertible", "Sport auto", 2),
    VAN ("Van", "Utility car", 3);

    private final String name;
    private final int nDoors;
    private final String description;

    CarTypes(String name, String description, int nDoors) {
        this.name = name;
        this.nDoors = nDoors;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getnDoors() {
        return nDoors;
    }

    public String getDescription() {
        return description;
    }
}
