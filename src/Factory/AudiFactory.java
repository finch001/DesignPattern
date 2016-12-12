package Factory;

/**
 * Created by finch on 2016/12/12.
 */
public class AudiFactory extends AbsFactory {

    @Override
    public <T extends AbsCar> T createCar(Class<T> clz) {
        AbsCar car = null;
        try {
            car = (AbsCar) Class.forName(clz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
