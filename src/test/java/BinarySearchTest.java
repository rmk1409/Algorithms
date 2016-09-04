import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Roma on 04.09.2016.
 */
public class BinarySearchTest {
    @Test
    public void search() throws Exception {
        int[] testAr = {1, 2, 3, 4, 5};
        assertEquals(BinarySearch.search(testAr, 2), 1);
        assertEquals(BinarySearch.search(testAr, 7), -1);
        assertEquals(BinarySearch.search(testAr, 1), 0);
        assertEquals(BinarySearch.search(testAr, 5), 4);

        testAr = new int[]{1};
        assertEquals(BinarySearch.search(testAr, 1), 0);
        assertEquals(BinarySearch.search(testAr, 2), -1);
        assertEquals(BinarySearch.search(testAr, 0), -1);

        testAr = new int[0];
        assertEquals(BinarySearch.search(testAr, 1), -1);
        assertEquals(BinarySearch.search(testAr, 2), -1);
        assertEquals(BinarySearch.search(testAr, 0), -1);

        testAr = null;
        assertEquals(BinarySearch.search(testAr, 1), -1);
        assertEquals(BinarySearch.search(testAr, 2), -1);
        assertEquals(BinarySearch.search(testAr, 0), -1);
    }
}