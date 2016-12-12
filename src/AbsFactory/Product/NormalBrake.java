package AbsFactory.Product;

import AbsFactory.Product.part.IBrake;

/**
 * Created by finch on 2016/12/12.
 */
public class NormalBrake implements IBrake{

    @Override
    public void brake() {
        System.out.println("normalBrake");
    }
}
