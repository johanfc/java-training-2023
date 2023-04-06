package com.jfc.streams;

import java.util.stream.Stream;

public class ParallelOrderedStream {

    public static void main(String args[]){

        Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
        // keep order, it is always a,b,c,1,2,3
        s.parallel().forEachOrdered(x -> System.out.println(x));

    }


}
