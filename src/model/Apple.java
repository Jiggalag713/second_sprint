package model;

import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount(){
        if (colour == "red") {
            return Discount.discountRedApple;
        }
        return 0.0;
    }
}
