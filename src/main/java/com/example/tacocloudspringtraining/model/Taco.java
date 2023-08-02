package com.example.tacocloudspringtraining.model;

import com.example.tacocloudspringtraining.data.IngredientRef;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Table
public class Taco {

    @Id
    private long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    public List<IngredientRef> getIngredientRefs() {
        List<IngredientRef> ingredientRefList = new ArrayList<>();
        for(Ingredient ingredient : ingredients) {
            ingredientRefList.add(new IngredientRef(ingredient.getId()));
        }
        return ingredientRefList;
    }
}
