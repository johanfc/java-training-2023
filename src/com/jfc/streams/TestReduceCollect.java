package com.jfc.streams;

import com.jfc.streams.util.Person;

import java.util.*;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class TestReduceCollect {

    public void groupPersonByCountry(){

        Person sara = new Person("Sara", 4,"CANADA");
        Person viktor = new Person("Viktor", 40,"COL");
        Person eva = new Person("Eva", 42,"USA");
        Person sofia = new Person("Sofia", 25,"CANADA");
        Person vicky = new Person("Vicky", 70,"COL");
        Person ema = new Person("ema", 21,"USA");
        List<Person> people = asList(sara, eva, viktor,sofia,vicky,ema);

        Map<String, Long> peopleByCountry = people.stream()
                .filter( x -> x.getAge() > 18 )
                .collect(groupingBy(Person::getNationality,counting()));

        System.out.println(peopleByCountry);

        //search the old person
        Optional<Person> oldPerson =
        people.stream().max(Comparator.comparingInt( Person::getAge ));

        System.out.println("oldest person is "+oldPerson.get().getName());

        return;
    }

    public static void  calculateWithReduce(List<Integer> numbers) {
        int total = 0;

        total = numbers.stream().reduce(total,(item1,item2) -> item1+item2);
        System.out.println("Sum of Array's elements: "+total);

        // To get the product of all elements
        int product = IntStream.range(2, 5)// 2 * 3 * 4 = 24
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);
        // Displaying the product
        System.out.println("The product is : " + product);

        return;

    }

    public static void getLongestString(){

        // creating a list of Strings
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);

    }

    public void combineString(){

        // String array
        String[] array = { "Geeks", "for", "Geeks" };

        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2)
                        -> str1 + "-" + str2);

        // Displaying the combined String
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }

    }

    public static void main(String args[]){

        TestReduceCollect accessor = new TestReduceCollect();
        accessor.groupPersonByCountry();
        //Sum array of numbers
        accessor.calculateWithReduce(asList(1, 2, 3, 4, 5,6));
        accessor.getLongestString();
        accessor.combineString();

    }
}
