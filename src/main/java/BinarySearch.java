/**
 * Created by Roma on 04.09.2016.
 */
public class BinarySearch {
    public static int search(int[] ar, int el) {
        int resultIndex = -1;

        if (ar.length == 0) {
            return resultIndex;
        }

        int leftBorder = 0,
                rightBorder = ar.length,
                middle;

        while (leftBorder < rightBorder) {
            middle = (rightBorder - leftBorder) / 2 + leftBorder;

            if (ar[middle] == el) {
                resultIndex = middle;
                return resultIndex;
            } else {
                if (ar[middle] > el) {
                    //not -1 to avoid missing element
                    rightBorder = middle;
                } else {
                    //+1 to avoid infinite useless work
                    leftBorder = middle + 1;
                }
            }
        }

        return resultIndex;
    }
}
