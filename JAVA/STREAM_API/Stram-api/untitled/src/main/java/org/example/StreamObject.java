package org.example;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //empty object
        Stream<Object> emptyStream = Stream.empty();

        //array, object, collection
        String[] names = {"BHOLE", "SHANKAR", "MAHADEV"};
        Stream<String> stream1= Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });
    }
}
