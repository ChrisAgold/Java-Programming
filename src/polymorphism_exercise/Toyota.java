package polymorphism_exercise;

// Make new car class
class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }
    // Override parent methods
    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

