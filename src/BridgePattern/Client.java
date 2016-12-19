package BridgePattern;

/**
 * Created by finch on 2016/12/19.
 */
public class Client {
    public static void main(String[] args) {
        Coffee bigSugarCoffee = new BigSugarCoffee();

        Coffee smallMilkCoffee = new SmallMilkCoffee();

        bigSugarCoffee.makeCoffee();
        System.out.println();
        smallMilkCoffee.makeCoffee();

    }


}
