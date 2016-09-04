/**
 * Created by Roma on 04.09.2016.
 * Popular algorithm for searching index in sorted structure
 * Speed: O(logN), Memory: O(1)
 */
public class BinarySearch {
    public static int search(int[] ar, int el) {
        int resultIndex = -1;

        if (ar == null || ar.length == 0) {
            return resultIndex;
        }

        int leftBorder = 0,
                rightBorder = ar.length,
                middle;

        while (leftBorder < rightBorder) {
            middle = (rightBorder - leftBorder) / 2 + leftBorder;

            if (ar[middle] == el) {
                resultIndex = middle;
                break;
            } else {
                if (ar[middle] > el) {
                    //not "rB=m-1" to avoid missing element
                    rightBorder = middle;
                } else {
                    //lB=m+1 to avoid infinite useless work
                    leftBorder = middle + 1;
                }
            }
        }

        return resultIndex;
    }
}
