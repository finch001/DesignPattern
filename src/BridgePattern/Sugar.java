package BridgePattern;

/**
 * Created by finch on 2016/12/19.
 */
public class Sugar extends CoffeeAddition {

    @Override
    protected String addSomething() {
        return "Sugar";
    }

    @Override
    protected int getPrize() {
        return 5;
    }
}
