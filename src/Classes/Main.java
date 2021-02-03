package Classes;

public class Main {
    public static void main(String[] args) {
        // Build an object for car based on template (class) for car
        Car porsche = new Car();
        Car toyota = new Car();
        porsche.setModel("Ford"); // change model to Ford
        System.out.println("Model is " + porsche.getModel());


    }
}
