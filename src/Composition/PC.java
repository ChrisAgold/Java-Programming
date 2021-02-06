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
    // changed to private so not accessible by main class anymore
    private Case getTheCase() {
        return theCase;
    }

    // function
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    // private method for drawLogo
    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }





//    private Monitor getMonitor() {
//        return monitor;
//    }
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
