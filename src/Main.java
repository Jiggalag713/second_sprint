import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, Colour.RED);
        Apple greenApple = new Apple(8, 60.0, Colour.GREEN);

        Food[] food = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(food);

        String sumWODiscount = String.format("Общая сумма товаров без скидки %s", shoppingCart.getPriceWODiscount());
        System.out.println(sumWODiscount);
        String sumWithDiscount = String.format("Общая сумма товаров со скидкой %s", shoppingCart.getPriceWithDiscount());
        System.out.println(sumWithDiscount);
        String sumWODiscounVegetarian = String.format("Общая сумма вегетерианских товаров без скидки %s", shoppingCart.getPriceWODiscountVegetarian());
        System.out.println(sumWODiscounVegetarian);
    }
}
