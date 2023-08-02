package com.example.tacocloudspringtraining.data;

import com.example.tacocloudspringtraining.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
