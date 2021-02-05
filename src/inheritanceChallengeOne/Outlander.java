package inheritanceChallengeOne;

public class Outlander extends Car {
    private int roadServiceMonths;

    // Constructor for Outlander
    public Outlander(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
