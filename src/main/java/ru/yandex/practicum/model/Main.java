package ru.yandex.practicum.model;

import ru.yandex.practicum.model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5, 100, false);
        Apple apple = new Apple(10, 50, true, Colour.RED);
        Apple apple1 = new Apple(8, 60, true, Colour.GREEN);

        Food[] foodList = new Food[3];
        foodList[0] = meat;
        foodList[1] =apple;
        foodList[2] =apple1;

        ShoppingCart shoppingCart = new ShoppingCart(foodList);

        System.out.println(shoppingCart.getTotalAmountPrice());//сумма всех товаров без скидки
        System.out.println(shoppingCart.getTotalPriceVeg());//сумма вегетарианских товаров без скидки
        System.out.println(shoppingCart.getTotalPriceDiscount());//сумма товаров со скидкой
        }
    }

