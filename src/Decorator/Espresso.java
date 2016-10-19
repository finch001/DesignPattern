package Decorator;

/**
 * Created by livvy on 2016/10/19 0019.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso coffee";
    }

    @Override
    public double cost() {
        if (getSize() == Beverage.SMALL) {
            prize += 2;
        } else if (getSize() == Beverage.MIDDLE) {
            prize += 4;
        } else if (getSize() == Beverage.BIG) {
            prize += 6;
        }
        return prize;
    }
}
