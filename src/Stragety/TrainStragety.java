package Stragety;

/**
 * Created by finch on 2016/12/13.
 */
public class TrainStragety implements IStragety {
    @Override
    public int Calculate(int km) {
        if (km > 0 && km < 5) {
            return 3;
        } else if (km >= 5 && km < 10) {
            return 5;
        } else {
            return 8;
        }

    }
}
