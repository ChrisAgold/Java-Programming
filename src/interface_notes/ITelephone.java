package interface_notes;

public interface ITelephone {
    // define interface methods
    void powerON();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}