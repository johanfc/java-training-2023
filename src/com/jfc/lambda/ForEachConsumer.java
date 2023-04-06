package com.jfc.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachConsumer {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("abc", "java", "python");
        Stream<String> myStream = Stream.of("abc", "java", "python");

        // convert a String to a Hex
        Consumer<String> printTextInHexConsumer = (String x) -> {
            StringBuilder sb = new StringBuilder();
            for (char c : x.toCharArray()) {
                String hex = Integer.toHexString(c);
                sb.append(hex);
            }
            System.out.print(String.format("%n%-10s:%s", x, sb.toString()));
        };

        // pass a Consumer
        myList.forEach(printTextInHexConsumer);
        System.out.println("\n With Stream");
        myStream.forEach(printTextInHexConsumer);

    }

}