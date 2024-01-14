package service;
import ru.yandex.practicum.model.Food;

public class ShoppingCart {
    protected Food[] foodlist;

    //конструктор класса ShoppingCart
    //Создает массив
    public ShoppingCart(Food[] foodList){
        this.foodlist = foodList;
    }

    //метод считает сумму всех товаров
    public double getTotalAmountPrice() {
        double totalPrice = 0;

        for (Food item : foodlist){
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    //метод считает сумму товаров вегетерианских
    public double getTotalPriceVeg() {
        double totalPrice = 0;

        for (Food item : foodlist){
            if (item.isVegeterian()){
                totalPrice += item.getTotalPrice();
            }
        }
        return totalPrice;
    }

    //метод считает сумму товаров со скидкой
    public double getTotalPriceDiscount(){
        double totalPrice = 0;
        for (Food items : foodlist){
            if (items.getDiscount() == 0.6){
                totalPrice += items.getTotalPrice() - (items.getDiscount() * items.getTotalPrice());
            } else {
            totalPrice += items.getTotalPrice();
            }
        }
        return totalPrice;
    }
}
