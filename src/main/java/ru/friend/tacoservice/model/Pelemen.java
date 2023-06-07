package ru.friend.tacoservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Pelemen {
    private String name;
    private List<Ingredient> ingridients;
}
