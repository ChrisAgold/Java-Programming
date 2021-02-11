package interface_notes;

public class PhoneMain {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerON();
        timsPhone.callPhone(123456);
        timsPhone.answer();
    }
}