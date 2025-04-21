import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, Colour.red);
        Apple greenApple = new Apple(10, 50.0, Colour.green);

        Food[] food = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.getPriceWODiscount());
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getPriceWithDiscount());
        System.out.println("Общая сумма вегетерианских товаров без скидки " + shoppingCart.getPriceWODiscountVegetarian());
    }
}
