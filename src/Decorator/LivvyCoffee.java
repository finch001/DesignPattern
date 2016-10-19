package Decorator;

/**
 * Created by livvy on 2016/10/19 0019.
 */
public class LivvyCoffee {
    public static void main(String[] agrs) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1.setSize(Beverage.MIDDLE);
        beverage1 = new Soy(new Mocha(new Mocha(new Whip(beverage1))));

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
