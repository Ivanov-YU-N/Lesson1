public class Candies extends Product {

    private double weight; // Объем

    public double getWeight() {
        return weight;
    }

    public Candies(String name, String brand, double price, double weight){
        super(name, brand, price);
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Конфеты] %s - %s - %.2f - v: %.2f", name, brand, price, weight);
    }
}