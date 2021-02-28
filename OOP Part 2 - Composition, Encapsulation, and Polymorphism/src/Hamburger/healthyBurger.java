package Hamburger;

public class healthyBurger extends Hamburger{
    private boolean ketchup;
    private boolean mayo;

    public healthyBurger(String breadRoll, String meat, double price) {
        super("Healthy Burger", "brown rye", meat, price);
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isMayo() {
        return mayo;
    }
}
