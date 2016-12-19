package BridgePattern;

/**
 * Created by finch on 2016/12/19.
 */
public class SmallMilkCoffee extends Coffee {

    public SmallMilkCoffee() {
        super(new Milk(), 0);
    }

    @Override
    public void makeCoffee() {
        System.out.print("Coffee " + addition.addSomething() + "Size " + size + "Total prize" + getPrize());
    }

    @Override
    public int getPrize() {
        return calculate();
    }

    private int calculate() {
        return addition.getPrize() + 15;
    }
}
