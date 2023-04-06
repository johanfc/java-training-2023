package com.jfc.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamSum {

    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }

        // Calculate the sum of the integers using a sequential stream
        long startTime = System.currentTimeMillis();
        int sumSequential = numbers.stream().reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential sum: " + sumSequential + " in " + (endTime - startTime) + "ms");

        // Calculate the sum of the integers using a parallel stream
        startTime = System.currentTimeMillis();
        int sumParallel = numbers.parallelStream().reduce(0, Integer::sum);
        endTime = System.currentTimeMillis();
        System.out.println("Parallel sum: " + sumParallel + " in " + (endTime - startTime) + "ms");
    }
}