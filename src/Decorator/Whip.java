package Decorator;

/**
 * Created by livvy on 2016/10/19 0019.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage ;

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
