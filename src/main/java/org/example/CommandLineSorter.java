package org.example;

import java.util.Arrays;

public class CommandLineSorter {
    public static String sortAndPrintNumbers(String[] args) {
        if (args.length == 0) {
            return "No arguments provided.";
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        int[] sortedNumbers = SortingLogic.sortNumbers(numbers);

        StringBuilder result = new StringBuilder("Sorted numbers:\n");
        for (int number : sortedNumbers) {
            result.append(number).append("\n");
        }

        return result.toString();
    }
}