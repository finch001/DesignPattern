package Decorator;

/**
 * Created by livvy on 2016/10/19 0019.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.SMALL) {
            cost += 0.10;
        } else if (getSize() == Beverage.MIDDLE) {
            cost += 0.20;
        } else if (getSize() == Beverage.BIG) {
            cost += 0.40;
        }
        return cost;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
