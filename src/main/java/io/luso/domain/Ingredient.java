package io.luso.domain;

import lombok.Builder;

@Builder
public class Ingredient {

    private String name;
    private int quantity;
    private UnitOfVolume unitOfVolume;
}
