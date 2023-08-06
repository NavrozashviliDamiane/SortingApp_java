

import org.example.CommandLineSorter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandLineSorterTest {
    @Test
    public void testSortAndPrintNumbers() {
        String[] args = {"5", "2", "9", "1"};
        String expectedOutput = "Sorted numbers:\n1\n2\n5\n9\n";

        String result = CommandLineSorter.sortAndPrintNumbers(args);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testSortAndPrintNumbers_NoArguments() {
        String[] args = {};
        String expectedOutput = "No arguments provided.";

        String result = CommandLineSorter.sortAndPrintNumbers(args);
        assertEquals(expectedOutput, result);
    }
}
