
import org.example.SortingLogic;
import org.junit.Assert;
import org.junit.Test;


public class SortingLogicTest {
    @Test
    public void testSortNumbers() {
        int[] input = {5, 2, 9, 1};
        int[] expectedOutput = {1, 2, 5, 9};

        int[] result = SortingLogic.sortNumbers(input);
        Assert.assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testSortEmptyArray() {
        int[] input = {};
        int[] expectedOutput = {};

        int[] result = SortingLogic.sortNumbers(input);
        Assert.assertArrayEquals(expectedOutput, result);
    }
}