package products;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product pineapple = new Product("Ананас", 100, 1.5f);
        Product bananas = new Product("Банан", 69, 0.8f);
        Product apple = new Product("Яблоко", 140, 1.2f);
        Product lemon = new Product("Лимон", 130, 0.9f);
        Product pear = new Product("Груша", 200, 0.5f);
        Set<Product> product = new HashSet<>();
        bananas.add(product);
        apple.add(product);
        pineapple.add(product);
        lemon.add(product);
        pear.add(product);
        System.out.println(product);

        pineapple.remove(product);
        pear.remove(product);
        System.out.println(product);
        printSeparator();

        Recipe fresh = new Recipe("Фреша");
        fresh.addProductInRecipe(bananas,2);
        fresh.addProductInRecipe(apple,2);
        fresh.addProductInRecipe(pineapple,1);
        printSeparator();
        Recipe limonade = new Recipe(" Лимонада ");
        limonade.addProductInRecipe(bananas,2);
        limonade.addProductInRecipe(apple,2);
        limonade.addProductInRecipe(pear,1);
        Set<Recipe> allRecipes = new HashSet<>();
        fresh.addRecipe(allRecipes);
        limonade.addRecipe(allRecipes);
        printSeparator();
        System.out.println(fresh.equals(limonade));
        printSeparator();
    }


    public static void printSeparator(){
        System.out.println("=====================");
    }
}
