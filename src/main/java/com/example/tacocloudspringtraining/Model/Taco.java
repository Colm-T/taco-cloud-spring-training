package com.example.tacocloudspringtraining.Model;

import com.example.tacocloudspringtraining.Model.Ingredient;
import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private String name;

    private List<Ingredient> ingredients;
}
