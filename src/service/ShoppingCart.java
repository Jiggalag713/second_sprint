package service;

import model.Food;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getPriceWODiscount() {
        double sum = 0.0;
        for (Food x: food) {
            sum = sum + x.getAmount() * x.getPrice();
        }
        return sum;
    }

    public double getPriceWithDiscount() {
        double sum = 0.0;
        for (Food x: food) {
            sum = sum + x.getAmount() * x.getPrice() * (1 - x.getDiscount() / 100);
        }
        return sum;
    }

    public double getPriceWODiscountVegetarian() {
        double sum = 0.0;
        for (Food x: food) {
            if (x.isVegetarian() == true) {
                sum = sum + x.getPrice() * x.getAmount();
            }
        }
        return sum;
    }
}
