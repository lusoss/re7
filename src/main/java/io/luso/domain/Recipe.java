package io.luso.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class Recipe {

    private List<Ingredient> ingredientList;
}
