package products;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String name;

    private HashMap<Product, Integer> productList;
    private float totalWeight;

    public Recipe(String name) {
        this.name = name;
        this.productList = new HashMap<>();

    }
    public void addRecipe(Set<Recipe> recipes){
        if(recipes.contains(this)){
            throw new RuntimeException("Такой рецепт уже есть!");
        } else {
            recipes.add(this);
        }
    }
    public void removeRecipe(Set<Recipe> recipes) {
        if (this == null) {
            throw new RuntimeException("Такой рецепт уже есть!");
        } else {
            recipes.remove(this);
        }
    }
        public void addProductInRecipe(Product products, int count) {
            if (count <= 0) {
                count = 1;
            } else {
                productList.put(products, count);
            }
            System.out.println("Рецепт " + name+ ": "  + count + " шт " + products.getName());
            totalWeight += products.getWeight() * count;
            System.out.println("Общий вес продуктов: " + totalWeight + " кг.");
        }
    public float getTotalWeight() {
        return totalWeight;
    }

    public HashMap<Product, Integer> getProductList() {
        return productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setProductList(HashMap<Product, Integer> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Наименование продукта: " + name + ", Список продуктов " + productList  +
                ", общий вес продуктов " + totalWeight + " кг." ;
    }

}
