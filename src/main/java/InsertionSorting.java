/**
 * Created by Roma on 09.09.2016.
 */
public class InsertionSorting {
    public static void sort(int[] ar) {

        for (int i = 1; i < ar.length; i++) {
            int curEl = ar[i];
            int cursor = i;

            while (cursor > 0 && curEl < ar[cursor - 1]) {
                ar[cursor] = ar[cursor - 1];
                cursor--;
            }

            ar[cursor] = curEl;
        }
    }
}
