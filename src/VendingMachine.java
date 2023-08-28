import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        if (products == null){
            products = new ArrayList<>();
        }
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (product.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }
    public Candies candies(String name, double weight){
        for (Product product : products){
            if (product instanceof Candies){
                Candies candies = (Candies)product;
                if (product.getName().equals(name) && candies.getWeight() == weight){
                    return candies;
                }
            }
        }
        return null;
    }
    public Yogurt yogurt(String name, double volume){
        for (Product product : products){
            if (product instanceof Yogurt){
                Yogurt yogurt = (Yogurt) product;
                if (product.getName().equals(name) && yogurt.getVolume() == volume){
                    return yogurt;
                }
            }
        }
        return null;
    }

}
