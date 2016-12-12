package Factory;

/**
 * Created by finch on 2016/12/12.
 */
public class Client {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();

        AbsCar a3 = audiFactory.createCar(AudiA3.class);
        a3.autoDrive();
        a3.Carname();

        AbsCar a5 = audiFactory.createCar(AudiA5.class);
        a5.autoDrive();
        a5.Carname();

        AbsCar a7 = audiFactory.createCar(AudiA7.class);
        a7.autoDrive();
        a7.Carname();
    }

}
