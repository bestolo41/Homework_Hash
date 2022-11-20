import java.util.Objects;

public class Food {
    private String title;
    private int price;
    private double quantity;

    private boolean isPurchased = false;

    public Food(String title, int price, double quantity) {
        setTitle(title);
        setPrice(price);
        setQuantity(quantity);
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

    public void setTitle(String title) {
        if (title == null || title.isEmpty() || title.isBlank()) {
            throw new RuntimeException("Заполните название товара");
        } else {
            this.title = title;
        }
    }

    public void setPrice(int price) {
        if (price == 0) {
            throw new RuntimeException("Заполните цену товара");
        } else {
            this.price = price;
        }
    }

    public void setQuantity(double quantity) {
        if (quantity == 0) {
            throw new RuntimeException("Заполните количество товара");
        } else {
            this.quantity = quantity;
        }
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return title.equals(food.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return (isPurchased ? "\uF0FE " : "☐ ") + title + ", " + quantity + "кг, " + price + "руб\n";
    }
}
