package MemoTo;

/**
 * Created by finch on 2016/12/18.
 */
public class TakeMemo {
    private Memo memo;

    public TakeMemo(Memo memo) {
        this.memo = memo;
    }

    public Memo restore() {
        return memo;
    }
}
