import java.util.Arrays;

/**
 * Created by Roma on 11.09.2016.
 * We can use this algorithm when range is small in comparing input data,
 * for example we have to sort 1_000_000 elements and range is 0..1000
 * Complexity: Speed - O(n+k), Space - O(k)
 */
public class CountingSorting {
    public static void sort(int[] ar){
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        for(int el: ar){
            if (min>el) min=el;
            if (max<el) max=el;
        }

        int[] rangeAr = new int[max-min+1];

        for (int anAr : ar) {
            rangeAr[anAr - min]++;
        }

        for (int i=0, j=0; j < rangeAr.length;) {
            if (rangeAr[j] != 0){
                rangeAr[j]--;
                ar[i++] = j+min;
            }else {
                j++;
            }
        }
    }
}
