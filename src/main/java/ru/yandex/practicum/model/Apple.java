package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;

import static ru.yandex.practicum.model.constants.Discount.DISCOUNT;


public class Apple extends Food {
    private String colour;
    public Apple(int amount, float price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian = true);
        this.colour = colour;
    }

    //Проверка на установку скидки
    @Override
    public double getDiscount() {
        return Colour.RED.equals(colour) ? DISCOUNT : 0;
    }
}
