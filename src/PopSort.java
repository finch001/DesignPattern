import java.util.ArrayList;
import java.util.List;

/**
 * Created by finch on 2016/12/14.
 */
public class PopSort {
    public static void main(String[] args) {
        PopSort pop = new PopSort();
        int[] data = new int[]{9, 7, 4, 2, 1};
        List<Integer> list = pop.sort(data, 3);
        for (int i : list) {
            System.out.println(i);
        }
    }

    private List<Integer> sort(int[] input, int k) {
        List<Integer> sort = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            for (int j = i; j < input.length - 1; j++) {
                if (input[j] < input[j + 1]) {
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
            sort.add(input[input.length - 1 - i]);
        }
        return sort;
    }
}
