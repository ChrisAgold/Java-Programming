package inheritanceChallengeOne;

public class Car extends Vehicle {

    // variables unique to car
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    // Constructor for a car adds vehicle properties
    // set current gear separately
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        // assume current gear is 1 when created
        this.currentGear = 1;
    }

    // Setter for current gear
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    // method
    public void changeVelocity(int speed, int direction) {
        // calls move method
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }

    // override vehicle stop method
    @Override
    public void stop() {
        super.stop();
    }
}
