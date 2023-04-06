package com.jfc.streams;

// Java code to print the elements of Stream
// using double colon operator

import java.util.stream.*;
import java.util.*;

    class DoubleColonOperator {

        public void printLn(){
            // Get the stream
            Stream<String> stream
                    = Stream.of("Geeks", "For",
                    "Geeks", "A",
                    "Computer",
                    "Portal");

            // Print the stream
            // using double colon operator
            stream.forEach(System.out::println);
        }

        static void someStaticFunction(String s){
            System.out.println(s);
        }

        public static void main(String[] args)
        {
            DoubleColonOperator obj = new DoubleColonOperator();

            obj.printLn();


        }
    }



