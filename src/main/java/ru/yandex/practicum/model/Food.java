package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;

public abstract class Food implements Discountable{
    protected int amount;
    protected float price;
    protected boolean isVegetarian;

    public Food(int amount, float price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    //расчет скидки по умолчанию
    @Override
    public double getDiscount() {
        return 0;
    }

    //расчет полной стоимости товаров
    public double getTotalPrice(){
        return amount * price;
    }


    //проверка наличия мяса в продуктах
    public boolean isVegeterian() {
        return isVegetarian;
    }

}

