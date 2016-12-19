import java.util.HashMap;
import java.util.Map;

/**
 * Created by finch on 2016/12/14.
 */
public class MapDemo {
    // volatile只保证了 可见性  在面对并发的时候 还是需要加锁来保证 原子性
    public static volatile int race = 0;

    private static final int THREAD_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        if (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println("Now the is number :" + race);
    }
    // 此处获取的是实例对象还是的class对象
    public static synchronized void increase() {
        race++;
    }

}
