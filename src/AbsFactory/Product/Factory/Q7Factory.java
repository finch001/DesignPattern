package AbsFactory.Product.Factory;

import AbsFactory.Product.ImportEngine;
import AbsFactory.Product.NormalTire;
import AbsFactory.Product.SeniorBrake;
import AbsFactory.Product.part.CarFactory;
import AbsFactory.Product.part.IBrake;
import AbsFactory.Product.part.IEngine;
import AbsFactory.Product.part.ITire;

/**
 * Created by finch on 2016/12/12.
 */
public class Q7Factory implements CarFactory {
    private IEngine engine;

    private ITire tire;

    private IBrake brake;

    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

}
