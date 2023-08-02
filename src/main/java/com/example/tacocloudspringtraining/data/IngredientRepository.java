package com.example.tacocloudspringtraining.data;

import com.example.tacocloudspringtraining.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}