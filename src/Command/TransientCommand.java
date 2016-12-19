package Command;

/**
 * Created by finch on 2016/12/14.
 */
public class TransientCommand implements ICommand {
    private Recevier recevier;


    public void setRecevier(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void execute() {
        if (recevier != null) {
            recevier.trasient();
        }

    }
}
