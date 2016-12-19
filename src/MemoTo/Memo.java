package MemoTo;

/**
 * Created by finch on 2016/12/18.
 */
public class Memo {
    public int checkPoint;
    public String weapon;
    public int healthy;

    @Override
    public String toString() {
        return "Memo{" +
                "checkPoint=" + checkPoint +
                ", weapon='" + weapon + '\'' +
                ", healthy=" + healthy +
                '}';
    }
}
