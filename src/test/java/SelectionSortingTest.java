import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Roma on 06.09.2016.
 */
public class SelectionSortingTest {
    @Test
    public void sort() throws Exception {
        int[] testAr = {1, 2, 3, 4, 5};
        SelectionSorting.sort(testAr);
        assertTrue(Arrays.equals(testAr, new int[]{1, 2, 3, 4, 5}));

        testAr = new int[]{2, 4, 5, 1, 0};
        SelectionSorting.sort(testAr);
        assertTrue(Arrays.equals(testAr, new int[]{0, 1, 2, 4, 5}));

        testAr = new int[]{5, 4, 3, 2};
        SelectionSorting.sort(testAr);
        assertTrue(Arrays.equals(testAr, new int[]{2, 3, 4, 5}));
    }

}