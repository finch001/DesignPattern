package Factory;

/**
 * Created by finch on 2016/12/12.
 */
public class AudiA3 extends AbsCar {

    @Override
    public void Carname() {
        System.out.println("AudiA3");
    }

    @Override
    public void autoDrive() {
        System.out.println("autoA3 can drive");
    }
}
