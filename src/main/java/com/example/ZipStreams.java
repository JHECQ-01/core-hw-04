package com.example;

import java.util.stream.Stream;

public class ZipStreams {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        var iter1 = first.iterator();
        var iter2 = second.iterator();
        Stream.Builder<T> builder = Stream.builder();

        while (iter1.hasNext() && iter2.hasNext()) {
            builder.accept(iter1.next());
            builder.accept(iter2.next());
        }

        return builder.build();
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6, 7);

        zip(stream1, stream2)
                .forEach(System.out::println);
    }
}
