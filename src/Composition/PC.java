package Composition;

public class PC {

    // (NOTE) Not using extends for classes, since you can only inherit from one class at a time
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Constructor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Getters
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
