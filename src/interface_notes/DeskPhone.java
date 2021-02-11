package interface_notes;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    // Constructor
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    // implement methods from interface
    @Override
    public void powerON() {
        System.out.println("No action taken.");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
