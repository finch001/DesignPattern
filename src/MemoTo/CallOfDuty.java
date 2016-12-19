package MemoTo;

/**
 * Created by finch on 2016/12/18.
 */
public class CallOfDuty {
    private int checkPoint = 1;

    private String weapon = "GUN";

    private int healthy = 100;


    public void play() {
        System.out.println("--------------play game-----------");
        healthy -= 1;
        System.out.println("--------------you are hurt-----------");
        checkPoint += 1;
        System.out.println("--------------you have get goal 2-----------");

    }

    public Memo storeMemo() {
        Memo memo = new Memo();
        memo.checkPoint = checkPoint;
        memo.healthy = healthy;
        memo.weapon = weapon;
        return memo;
    }

    public void reStore(Memo memo) {
        checkPoint = memo.checkPoint;
        weapon = memo.weapon;
        healthy = memo.healthy;
    }


    @Override
    public String toString() {
        return "CallOfDuty{" +
                "checkPoint=" + checkPoint +
                ", weapon='" + weapon + '\'' +
                ", healthy=" + healthy +
                '}';
    }
}
