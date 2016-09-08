/**
 * Created by Roma on 08.09.2016.
 * The most popular algorithm, in average case works 2-3 times faster than merge sort and heap sort,
 * but in worst case takes O(n2) time, in average case it takes O(n log n).
 * To avoid n2 time, it's recommended to shuffle array before sort.
 */
public class QuickSorting {
    public static void sort(int[] ar, int low, int high) {
        int i = low, j = high, pivot = ar[(high - low) / 2 + low];

        while (i <= j){

            //move left and right cursor
            while (ar[i]<pivot) i++;
            while (ar[j]>pivot) j--;

            //swap elements
            if (i<=j){
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++; j--;
            }
        }

        //recursion
        if (i<high) sort(ar, i, high);
        if (j>low) sort(ar, low, j);
    }
}
