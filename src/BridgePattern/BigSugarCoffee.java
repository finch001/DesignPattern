package BridgePattern;

/**
 * Created by finch on 2016/12/19.
 */
public class BigSugarCoffee extends Coffee {

    public BigSugarCoffee() {
        super(new Sugar(), 1);
    }

    @Override
    public void makeCoffee() {
        System.out.print("Coffee " + addition.addSomething() + "SIZE " + size + "Total prize:" + getPrize());
    }

    @Override
    public int getPrize() {
        return calculate();
    }

    private int calculate() {
        return addition.getPrize() + 20;
    }
}
