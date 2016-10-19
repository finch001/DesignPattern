package Decorator;

/**
 * Created by livvy on 2016/10/19 0019.
 */
public abstract class Beverage {
    protected String description = "unknow Beverage";
    protected double prize;
    protected  int size = MIDDLE;

    public static final int BIG = 0;
    public static final int MIDDLE = 1;
    public static final int SMALL = 2;
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
