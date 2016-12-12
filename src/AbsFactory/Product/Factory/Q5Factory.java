package AbsFactory.Product.Factory;

import AbsFactory.Product.DomestivEngine;
import AbsFactory.Product.NormalBrake;
import AbsFactory.Product.NormalTire;
import AbsFactory.Product.part.CarFactory;
import AbsFactory.Product.part.IBrake;
import AbsFactory.Product.part.IEngine;
import AbsFactory.Product.part.ITire;

/**
 * Created by finch on 2016/12/12.
 */
public class Q5Factory implements CarFactory {


    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }

    @Override
    public IEngine createEngine() {
        return new DomestivEngine();
    }
}
