package MemoTo;

/**
 * Created by finch on 2016/12/18.
 */
public class Client {
    public static void main(String[] agrs) {
        CallOfDuty callOfDuty = new CallOfDuty();

        callOfDuty.play();

        TakeMemo takeCare = new TakeMemo(callOfDuty.storeMemo());

        CallOfDuty newGame = new CallOfDuty();

        newGame.reStore(takeCare.restore());

        System.out.println(newGame);
    }


}
