package BridgePattern;

/**
 * Created by finch on 2016/12/19.
 */
public class Milk extends CoffeeAddition {


    @Override
    protected String addSomething() {
        return "Milk";
    }

    @Override
    protected int getPrize() {
        return 3;
    }
}
