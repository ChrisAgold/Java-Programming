package OOPChllenge;

public class Hamburger {
    // Variables
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    // Addition Variables
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

    // Getters

    // Methods //

    // addition method
    public void addHamburgerAddition1(String name, double price){
        this.name = addition1Name;
        this.price = addition1Price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.name = addition2Name;
        this.price = addition2Price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.name = addition3Name;
        this.price = addition3Price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.name = addition4Name;
        this.price = addition4Price;
    }


}
