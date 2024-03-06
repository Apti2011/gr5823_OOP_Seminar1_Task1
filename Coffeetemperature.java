public class Coffeetemperature extends Hotdrink {
    private int temperature;

    public Coffeetemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperarure(int temperature) {
        this.temperature = temperature;
    }
}
