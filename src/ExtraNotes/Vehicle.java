package ExtraNotes;

// Vehicle class helps make
class Vehicle {

    int maxspeed;

    Vehicle() {
        System.out.println("Vehicle constructor");
    }


    // Method within vehicle
//    public void vroom() {
//        System.out.println("Vroom vroom");
//
//
//    }
    //    int maxSpeed = 120;
}

// Make car objects
class Car extends Vehicle {

    int maxSpeed;

    // create constructor for car
    Car(int maxSpeed) {

        //super();// calls vehicle constructor

    }

    public Car() {

    }


    // method within car
//    public void vroom() {
//
//        // super runs vehicle method (parent class)
//        super.vroom();
}
//    int maxSpeed = 100;
//    public void display() {
//        System.out.println(super.maxSpeed); // super refers to vehicle class and returns 120
//    }
//}



