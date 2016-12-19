package Stragety;

/**
 * Created by finch on 2016/12/13.
 */
public class BusStragety implements IStragety {
    @Override
    public int Calculate(int km) {
        if (km < 5 && km > 0) {
            return 10;
        } else if (km >= 5 && km < 10) {
            return 15;
        } else {
            return 8;
        }
    }
}
