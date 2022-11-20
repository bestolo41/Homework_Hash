import java.util.HashSet;
import java.util.Set;

public class RecipeBook {
    private Set<Recipe> recipeBook = new HashSet<>();

    public void addNewRecipe(Recipe recipe) {
        if (recipeBook.add(recipe)) {}
        else {
            throw new RuntimeException("Рецепт уже имеется в книге");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Recipe recipe : recipeBook) {
            builder.append(recipe.toString()).append("\n");
        }
        return builder.toString();
    }
}

