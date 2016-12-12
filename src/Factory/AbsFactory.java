package Factory;

/**
 * Created by finch on 2016/12/12.
 */
public abstract class AbsFactory {
    public abstract  <T extends AbsCar> T createCar(Class<T> clz);

}
