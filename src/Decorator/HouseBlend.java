package Decorator;

/**
 * Created by livvy on 2016/10/19 0019.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House blend Coffee";
    }

    public double cost(){
        return 0.99;
    }

}
