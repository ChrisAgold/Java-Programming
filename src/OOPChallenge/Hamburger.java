package OOPChallenge;

public class Hamburger {
    //    // Variables
//    private String name;
//    private String meat;
//    private double price;
//    private String breadRollType;
//
//    // Addition Variables
//    private String addition1Name;
//    private double addition1Price;

//    private String addition2Name;
//    private double addition2Price;

//    private String addition3Name;
//    private double addition3Price;

//    private String addition4Name;
//    private double addition4Price;

//    // Constructor
//    public Hamburger(String name, String meat, double price, String breadRollType) {
//        this.name = name;
//        this.meat = meat;
//        this.price = price;
//        this.breadRollType = breadRollType;
//    }

//    // Methods //

//    // addition method to add additions
//    public void addHamburgerAddition1(String name, double price){
//        this.name = addition1Name;
//        this.price = addition1Price;
//    }

//    public void addHamburgerAddition2(String name, double price){
//        this.name = addition2Name;
//        this.price = addition2Price;
//    }

//    public void addHamburgerAddition3(String name, double price){
//        this.name = addition3Name;
//        this.price = addition3Price;
//    }

//    public void addHamburgerAddition4(String name, double price){
//        this.name = addition4Name;
//        this.price = addition4Price;
//    }

//    //  add price of additional items
//    public double itemizeHamburger() {
//        double hamburgerPrice = this.price; // basic price of hamburger
//        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + "price is " + this.price);

//        // check if each item has been added
//        if(this.addition1Name != null) { // != null means something was sent to us
//            hamburgerPrice += this.addition1Price;
//            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);

//        }
//
//        if(this.addition2Name != null) { // != null means something was sent to us
//            hamburgerPrice += this.addition2Price;
//            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);

//        }

//        if(this.addition3Name != null) { // != null means something was sent to us
//            hamburgerPrice += this.addition3Price;
//            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);

//        }

//        if(this.addition4Name != null) { // != null means something was sent to us
//            hamburgerPrice += this.addition4Price;
//            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);

//        }
//        return hamburgerPrice;
//    }
//}

    // Variables
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    // Addition variables
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    // Constructor
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    // Add additional items method
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    // add items to burger and add to price
    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is " + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        // return the price
        return hamburgerPrice;
    }
}