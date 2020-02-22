package io.luso.domain;

import org.junit.Test;

import java.util.List;

public class RecipeTest {

    @Test
    public void testBuilder() {
        Ingredient milk = Ingredient.builder()
                .name("milk")
                .quantity(250)
                .unitOfVolume(UnitOfVolume.MILLILITRES).build();
        Recipe recipe = Recipe.builder().ingredientList(List.of(milk)).title("Pain doré").build();
        System.out.println("recipe = " + recipe);
    }
}