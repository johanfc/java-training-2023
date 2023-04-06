package com.jfc.strings;
import java.util.*;
public class StringToCharArry {


public void convert(String convertible){

        // Creating array and Storing the array
    // returned by toCharArray()
    char[] ch = convertible.toCharArray();

    // Printing array
    for (char c : ch) {
        System.out.println(c);
    }

}
// Java program to Convert a String
// to a Character array using toCharArray()
    public static void main(String args[])
    {
        StringToCharArry obj = new StringToCharArry();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter word");

        String word = myObj.nextLine();  // Read user input
        obj.convert(word);  // Output user input

    }
}
