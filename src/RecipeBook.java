import java.util.HashSet;
import java.util.Set;

public class RecipeBook {
    private Set<Recipe> recipeBook = new HashSet<>();

    public void addNewRecipe(Recipe recipe) {
        if (!recipeBook.contains(recipe)) recipeBook.add(recipe);
        else throw new RuntimeException("Рецепт уже имеется в книге");
    }

    @Override
    public String toString() {
        String text = "";
        for (Object o : recipeBook.toArray()) {
            Recipe obj = (Recipe) o;
            text = text + obj.toString();
        }
        return text;
    }
}
