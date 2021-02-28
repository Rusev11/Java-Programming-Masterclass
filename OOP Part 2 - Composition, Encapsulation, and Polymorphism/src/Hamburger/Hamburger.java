package Hamburger;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;
    private Additions additions;

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public Boolean isLettuce() {
        return this.additions.isLettuce();
    }

    public Boolean isTomato() {
        return this.additions.isTomato();
    }

    public Boolean isCarrot() {
        return this.additions.isCarrot();
    }

    public Boolean isCucumber() {
        return this.additions.isCucumber();
    }

}
