package ru.yandex.practicum.model;

public class Meat extends Food {
    public Meat(int amount, float price, boolean isVegetarian) {
        super(amount, price, isVegetarian = false);
    }
}
