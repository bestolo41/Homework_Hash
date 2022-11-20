import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Food> productList = new HashSet<>();
    private String title;

    public ProductList(String title) {
        this.title = title;
    }

    public void addFood(String title, int price, double quantity) {
        Food food = new Food(title, price, quantity);
        if (productList.contains(food)) {
            throw new RuntimeException("Продукт " + title + " уже в списке");
        } else {
            productList.add(food);
        }
    }

    public void addFood(String title, int price) {
        this.addFood(title, price, 0);
    }

    public void addFood(String title, double quantity) {
        this.addFood(title, 0, quantity);
    }

    public void addFood(String title) {
        this.addFood(title, 0, 0);
    }

    public void remove(String title) {
        for (Food food : productList) {
            if (food.getTitle().equals(title)) {
                getProductList().remove(food);
                System.out.println(title + " удален из списка\n");
                return;
            }
        }
        throw new RuntimeException("В списке нет продукта " + title);
    }

    public void purchased(String title) {
        for (Food food : productList) {
            if (food.getTitle().equals(title)) {
                food.setPurchased(true);
            }
        }
        throw new RuntimeException("В списке нет продукта " + title);
    }

    public void getList() {
        System.out.println(this);
    }

    public Set<Food> getProductList() {
        return productList;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {                                  // чтоб не печатал в квадратных скобках. Есть способ получше и короче?
        StringBuilder builder = new StringBuilder();
        builder.append(getTitle()).append("\n");
        for (Food food : productList) {
            builder.append(food.toString());
        }
        return builder.toString();
    }
}
