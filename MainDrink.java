public class MainDrink {
    public static void main(String[] args) {
        Coffeetemperature hotdrink1 = new Coffeetemperature("Эспрессо", 50, 90);
        Coffeetemperature hotdrink2 = new Coffeetemperature("Латте", 250, 80);

        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        Coffeetemperature drink1 = hotDrinksVendingMachine.getProduct("Эспрессо", 50, 90);
        Coffeetemperature drink2 = hotDrinksVendingMachine.getProduct("Латте", 250, 80);
    }
}
