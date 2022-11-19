import java.util.Objects;

public class Food {
    private String title;
    private int price;
    private double quantity;

    private boolean isPurchased = false;

    public Food(String title, int price, double quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public Food(String title) {

        this(title, 0, 0);
    }

    public Food(String title, int price) {
        this(title, price, 0);
    }

    public Food(String title, double quantity) {
        this(title, 0, quantity);
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return price == food.price && Double.compare(food.quantity, quantity) == 0 && isPurchased == food.isPurchased && Objects.equals(title, food.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, quantity, isPurchased);
    }

    @Override
    public String toString() {
        return (isPurchased == true ? "\uF0FE " : "☐ ") + title + ", " + quantity + "кг, " + price + "руб\n";
    }
}
