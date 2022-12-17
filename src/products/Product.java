package products;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private int price;
    private float weight;
    public Product(String name, int price, float weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public void add(Set<Product> products){
        if(products.contains(this)){
            throw new RuntimeException("Такой продукт уже есть!");
        } else {
            products.add(this);
        }
    }
    public void remove(Set<Product> products) {
        if (this == null) {
            throw new RuntimeException("Такой продукт уже есть!");
        } else {
            products.remove(this);
        }
    }
        public String getName () {
            return name;
        }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Задайте карточку товара полностью!");
        }
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Задайте карточку товара полностью!");
        }
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Задайте карточку товара полностью!");
        }
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product products = (Product) o;
        return Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Наименование продукта: " + name +  " Цена: " + price + "р, Вес: " + weight+ " кг.";
    }
}
