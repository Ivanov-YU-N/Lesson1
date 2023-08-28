import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", "ООО Источник", 250, 0.5);
        System.out.println(bottleOfWater1.displayInfo());
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Молоко#1", "ООО Молоко", 250, 2, 15);
        System.out.println(bottleOfMilk1.displayInfo());
        Product bottleOfMilk2 = new BottleOfMilk("Молоко#1", "ООО Молоко", 250, 1, 15);
        System.out.println(bottleOfMilk1.displayInfo());
        Product candies = new Candies("Конфеты", "ООО Конфеты", 120, 0.5);
        System.out.println(candies.displayInfo());
        Yogurt yogurt1 = new Yogurt("Йогурт", "ООО Йогурт", 55, 0.25, 8);
        System.out.println(yogurt1.displayInfo());
        Product yogurt2 = new Yogurt("Йогурт", "ООО Йогурт", 55, 0.5, 7);
        System.out.println(yogurt2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk2);
        products.add(candies);
        products.add(yogurt2);
        products.add(yogurt1);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Вода", 1);
        if (bottleOfWater != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWater.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        VendingMachine vendingMachine1 = new VendingMachine(products);
        Candies candies1 = vendingMachine.candies("Конфеты", 0.5);
        if (candies != null) {
            System.out.println("Вы купили: ");
            System.out.println(candies.displayInfo());
        } else {
            System.out.println("Конфет нет.");
        }

        VendingMachine vendingMachine2 = new VendingMachine(products);
        Yogurt yogurt = vendingMachine.yogurt("Йогурт", 0.25);
        if (yogurt != null) {
            System.out.println("Вы купили: ");
            System.out.println(yogurt.displayInfo());
        } else {
            System.out.println("Йогурта нет.");
        }
    }

}