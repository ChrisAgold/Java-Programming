package OOPChllenge;

public class DeluxeBurger extends Hamburger{
    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.57);
        super.addHamburgerAddition2("Drink", 1.18);



    }





}
