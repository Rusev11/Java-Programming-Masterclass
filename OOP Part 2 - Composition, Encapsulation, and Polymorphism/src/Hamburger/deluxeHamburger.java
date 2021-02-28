package Hamburger;

public class deluxeHamburger extends Hamburger{
    private boolean chips;
    private boolean drinks;

    public deluxeHamburger(String name, String breadRoll, String meat, double price, boolean chips, boolean drinks) {
        super(name, breadRoll, meat, price);
        this.chips = true;
        this.drinks = true;
    }

    public boolean isChips() {
        return chips;
    }

    public void setChips(boolean chips) {
        this.chips = chips;
    }

    public boolean isDrinks() {
        return drinks;
    }

    public void setDrinks(boolean drinks) {
        this.drinks = drinks;
    }
}
