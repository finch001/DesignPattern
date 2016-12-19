package Stragety;

/**
 * Created by finch on 2016/12/13.
 */
public class Client {
    private IStragety stragety;

    public static void main(String[] args) {
        Client client = new Client();
        client.setStragety(new BusStragety());
        System.out.println("Bus 3km prize is: " + client.calculatePrice(3));

        client.setStragety(new TrainStragety());
        System.out.println("Train 3km prize is " + client.calculatePrice(3));


    }

    public void setStragety(IStragety stragety) {
        this.stragety = stragety;
    }

    public int calculatePrice(int km) {
        if (stragety == null) {
            return 0;
        }
        return stragety.Calculate(km);
    }

}
