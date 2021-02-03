package Classes;

// new class
public class Car {

    // Variables for car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // create method to update the model variable (SET MODEL VARIABLE)
    // SETTER
    public void setModel(String model) {
        // Use Getters & Setter to validate
        String validateModel = model.toLowerCase();
        // model will only change to Ford if true
        if(validateModel.equals("ford") || validateModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        //this.model = model;  // this refers to the field we want to change
    }

    // Method to return the current model (GET MODEL VARIABLE THAT WE SET)
    // GETTER
    public String getModel() {
        return this.model;
    }
}
