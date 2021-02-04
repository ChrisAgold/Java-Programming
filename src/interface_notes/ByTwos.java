package interface_notes;

public class ByTwos implements Series {
    // variable
    int val;

    // Constructor
    ByTwos() {
        val = 0;
    }

    // Method
    public int getNext() {
        if(val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
        }
        return val;
    }
}
