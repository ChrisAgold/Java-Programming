package Composition;
// Composition: Creating Objects within Objects //
public class Main {

    public static void main(String[] args) {

        // create dimensions
        Dimensions dimensions = new Dimensions(20, 20, 5);

        // create case
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        // create monitor
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1140)); // NOTE can create new Resolution class inside the create monitor

        // create Motherboard
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // Put PC together! (inherits features from all parts)
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        // call powerUp function in PC.java
        thePC.powerUp();


        // Uncomment with code in PC.java to use
        // ACCESS METHODS FROM THE CLASSES //
        // access draw method from monitor from the PC, using getter
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        // access method from motherboard
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        // access function from Case
//        thePC.getTheCase().pressPowerButton();

        // CHALLENGE //
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class







    }
}
