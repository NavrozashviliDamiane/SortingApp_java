package org.example;

import java.util.Arrays;

public class SortingLogic {
    public static int[] sortNumbers(int[] numbers) {
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);
        return sortedNumbers;
    }
}