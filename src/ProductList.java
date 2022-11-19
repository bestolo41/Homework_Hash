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
        if (productList.contains(food)) throw new RuntimeException("Продукт " + title + " уже в списке");
        else productList.add(food);
    }

    public void addFood(String title, int price) {
        throw new RuntimeException("Заполните количество товара " + title);
    }

    public void addFood(String title, double quantity) {
        throw new RuntimeException("Заполните цену товара " + title);
    }

    public void addFood(String title) {
        throw new RuntimeException("Заполните цену и количество товара " + title);
    }

    public void remove(String title) {
        for (Object o : getProductList().toArray()) {
            Food obj = (Food) o;
            if (obj.getTitle().equals(title)) {
                getProductList().remove(obj);
                System.out.println(title + " удален из списка\n");
                return;
            }
        }
        throw new RuntimeException("В списке нет продукта " + title);
    }

    public void purchased(String title) {
        for (Object o : getProductList().toArray()) {
            Food obj = (Food) o;
            if (obj.getTitle().equals(title)) {
                obj.setPurchased(true);
                System.out.println("Продукт " + title + " куплен\n");
                return;
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
        String text = getTitle() + ":\n";
        for (Object o : getProductList().toArray()) {
            Food obj = (Food) o;
            text = text + obj.toString();
        }
        return text;
    }
}
