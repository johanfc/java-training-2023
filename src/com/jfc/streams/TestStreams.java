package com.jfc.streams;
import com.jfc.streams.util.Person;

import java.util.*;
import java.util.stream.Collectors;


import static java.util.Arrays.asList;

public class TestStreams {


    //import classes and packages for implementing the ReduceExample2 class
//
    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Person getOldestPerson() {

        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> people = asList(sara, eva, viktor);

        Person oldestPerson = new Person("", 0);

        oldestPerson = people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .get();

        return oldestPerson;
    }


//Flatten multidimensional collection
public static List<String> transform(List<List<String>> collection) {
    List<String> newCollection = new ArrayList<>();
    newCollection = collection.stream()
            .flatMap( x -> x.stream() )
                   // .collect(Collectors.toCollection(ArrayList::new));
            .collect(Collectors.toList());

    newCollection.forEach(System.out::println);
    return newCollection;
}


    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        List<String> nomss = new ArrayList<>();

        for (String nom : names){
            nomss.add(nom);
        }

        int sum = nomss.stream()
                .filter(name -> name.length() > 5)
                .mapToInt(name -> name.length())
                .sum();
        //.forEach( nameInt -> System.out.println("Stream of item length"+nameInt));
        return sum;
    }

    //create class ReduceExample3

        // main() method starts
        public static void main(String[] args)
        {

            TestStreams accessor = new TestStreams();
            //Get total number of letters from names longer than 5
            int sumOfLetters = accessor
                    .getTotalNumberOfLettersOfNamesLongerThanFive(
                            "william", "jones", "aaron", "seppe", "frank", "gilliam");            //
            System.out.println("Les plus grands: "+sumOfLetters);

            ////Flatten multidimensional collection
            List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
            List flatCollection = accessor.transform(collection);


            //getTheOldesPerson
            System.out.println("The oldest person is: "+ accessor.getOldestPerson().getName());



        }

}
