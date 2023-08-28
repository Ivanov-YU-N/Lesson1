public class Yogurt extends Product{
    private double volume;
    private  int fat;

    public double getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    public Yogurt(String name, String brand, double price, double volume, int fat){
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[Йогурт] %s - %s - %.2f - v: %.2f; f: %d", name, brand, price, volume, fat);
    }

}
