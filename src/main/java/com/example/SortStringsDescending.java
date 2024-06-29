package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class SortStringsDescending {

    public static List<String> sortStringsDescending(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("1. Ivan", "3. Peter", "2. Mary");
        List<String> result = sortStringsDescending(strings);
        result.forEach(System.out::println);
    }
}
