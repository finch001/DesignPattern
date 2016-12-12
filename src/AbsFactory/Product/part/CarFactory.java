package AbsFactory.Product.part;

/**
 * Created by finch on 2016/12/12.
 */
public interface CarFactory {
    ITire createTire();

    IBrake createBrake();

    IEngine createEngine();
}
