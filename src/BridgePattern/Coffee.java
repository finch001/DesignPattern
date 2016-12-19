package BridgePattern;

/**
 * Created by finch on 2016/12/19.
 */
public abstract class Coffee {
    public static final int BIG_SIZE = 1;
    public static final int SMALL_SIZE = 0;

    protected CoffeeAddition addition;
    protected int size = 0;

    protected int prize = 0;

    public Coffee(CoffeeAddition addition, int size) {
        this.addition = addition;
        this.size = size;
    }

    public abstract void makeCoffee();

    public abstract int getPrize();
}
