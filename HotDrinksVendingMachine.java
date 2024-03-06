public class HotDrinksVendingMachine implements VendingMachine {
    @Override
    public void getProduct() {
    }

    public Coffeetemperature getProduct(String name, int volume, int temperature) {
        return new Coffeetemperature(name, volume, temperature);
    }
}
