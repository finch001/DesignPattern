package Command;

/**
 * Created by finch on 2016/12/14.
 */
public class ButtonInvoker {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;

    private FallCommand fallCommand;
    private TransientCommand transientCommand;


    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransientCommand(TransientCommand transientCommand) {
        this.transientCommand = transientCommand;
    }


    public void toLeft() {
        leftCommand.execute();
    }

    public void toRight() {
        rightCommand.execute();
    }

    public void fall() {
        fallCommand.execute();
    }

    public void trasient() {
        transientCommand.execute();
    }

}
