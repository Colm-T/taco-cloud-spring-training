package com.example.tacocloudspringtraining.data;

import lombok.Data;

@Data
public class IngredientRef {

    private final String ingredient;

    public IngredientRef(String ingredient) {
        this.ingredient = ingredient;
    }
}
