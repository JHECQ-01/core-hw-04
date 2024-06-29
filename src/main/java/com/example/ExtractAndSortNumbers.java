package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExtractAndSortNumbers {
    public static String sortedNumbers(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String result = sortedNumbers(arr);
        System.out.println(result);
    }
}
