package Factory;

/**
 * Created by finch on 2016/12/12.
 */
public class AudiA7 extends AbsCar {

    @Override
    public void Carname() {
        System.out.println("AudiA7");
    }

    @Override
    public void autoDrive() {
        System.out.println("autoA7 can drive");
    }
}
