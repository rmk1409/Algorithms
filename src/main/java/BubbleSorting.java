/**
 * Created by Roma on 05.09.2016.
 * Educational stable algorithm
 * Speed: O(n2), Memory: O(1)
 */
public class BubbleSorting {
    public static void sort(int[] ar) {
        boolean flag;
        for (int i = 0; i < ar.length - 1; i++) {
            flag = false;
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
