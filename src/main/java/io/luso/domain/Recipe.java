package io.luso.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class Recipe {

    private String title;
    private String imageFileName;
    private List<Ingredient> ingredientList;
    private long preparationTime;
    private short servings;
    private long cookTime;
    private List<String> directions;
    private List<String> notes;

}
