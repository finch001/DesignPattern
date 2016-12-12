package Factory;

/**
 * Created by finch on 2016/12/12.
 */
public class AudiA5 extends AbsCar {

    @Override
    public void Carname() {
        System.out.println("AudiA5");
    }

    @Override
    public void autoDrive() {
        System.out.println("autoA5 can drive");
    }
}
