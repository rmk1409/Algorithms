import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Roma on 11.09.2016.
 */
public class CountingSortingTest {
    @Test
    public void sort() throws Exception {
        int[] testAr = {1, 2, 3, 4, 5};
        CountingSorting.sort(testAr);
        assertTrue(Arrays.equals(testAr, new int[]{1, 2, 3, 4, 5}));

        testAr = new int[]{2, 4, 5, 1, 1, 0};
        CountingSorting.sort(testAr);
        assertTrue(Arrays.equals(testAr, new int[]{0, 1, 1, 2, 4, 5}));

        testAr = new int[]{5, 4, 3, 2, 1};
        CountingSorting.sort(testAr);
        assertTrue(Arrays.equals(testAr, new int[]{1, 2, 3, 4, 5}));
    }

}