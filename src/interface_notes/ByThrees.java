package interface_notes;
public class ByThrees implements Series {
    // variable
    int val;

    // Constructor
    ByThrees() {
        val = 0;
    }

    // Method
    public int getNext() {
        val += 3;
        return val;
    }

}
