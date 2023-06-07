package ru.friend.tacoservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingridients> ingridients;
}
