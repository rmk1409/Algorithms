/**
 * Created by Roma on 06.09.2016.
 * Educational stable algorithm
 * Find index of min element and do swap the elements
 *
 * Speed: O(n2), Memory: O(1)
 */
public class SelectionSorting{
    
    public static void sort(int[] ar) {
        for (int i = 0; i < ar.length-1; i++) {
            int indexOfMinEl = i;

            for (int j = i+1; j < ar.length; j++) {
                if (ar[indexOfMinEl] > ar[j]){
                    indexOfMinEl = j;
                }
            }

            if (indexOfMinEl != i){
                int temp = ar[i];
                ar[i] = ar[indexOfMinEl];
                ar[indexOfMinEl] = temp;
            }
        }    
    }
}
