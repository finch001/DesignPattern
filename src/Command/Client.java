package Command;

/**
 * Created by finch on 2016/12/14.
 */
public class Client {
    public static void main(String[] args) {
        Recevier recevier = new Recevier();

        FallCommand fallCommand = new FallCommand();
        fallCommand.setRecevier(recevier);
        LeftCommand leftCommand = new LeftCommand();
        leftCommand.setRecevier(recevier);
        RightCommand rightCommand = new RightCommand();
        rightCommand.setRecevier(recevier);
        TransientCommand transientCommand = new TransientCommand();
        transientCommand.setRecevier(recevier);

        ButtonInvoker invoker = new ButtonInvoker();
        invoker.setFallCommand(fallCommand);
        invoker.setLeftCommand(leftCommand);
        invoker.setRightCommand(rightCommand);
        invoker.setTransientCommand(transientCommand);

        invoker.toLeft();
        invoker.toRight();
        invoker.fall();
        invoker.trasient();


    }

}
