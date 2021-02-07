package polymorphism_exercise;

// Make new car class
class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    // Override parent methods
    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

