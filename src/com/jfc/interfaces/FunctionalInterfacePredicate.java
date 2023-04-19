package com.jfc.interfaces;// A simple program to demonstrate the use
// of predicate interface
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Test3
{
    public static void fonctionEvenNumbers(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isMoreThanFive = num -> num > 5;

        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven.and(isMoreThanFive))
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // prints "[2, 4]"
    }

    public static void printTestPredicate(){
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");

        Predicate<String> predicate = (s)->s.startsWith("G");
        names.stream().filter(predicate::test).forEach(System.out::println);
    }

    public static void main(String args[])
    {
        fonctionEvenNumbers();
        printTestPredicate();
    }
}

