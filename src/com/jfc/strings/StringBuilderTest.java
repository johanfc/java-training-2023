package com.jfc.strings;

import java.util.Scanner;

public class StringBuilderTest {

    private String inputText;

    public StringBuilderTest(){}

    public StringBuilderTest(String inputText) {
        this.inputText = inputText;
    }

    public String reverseString(String str){

        StringBuilder rev = new StringBuilder();
        System.out.println("lenght:"+str.length());

        for(int i = str.length();i>0;i--){
            System.out.println("Char At "+i+" "+str.charAt(i-1));
            rev.append(str.charAt(i-1));
        }
        return rev.toString();
    }

    public String reverseStringBuilder(String str){

        StringBuilder rev = new StringBuilder(str);
        System.out.println("lenght:"+str.length());

        rev.reverse();

        return rev.toString();
    }
    public static void main(String args[]){

        StringBuilderTest obj = new StringBuilderTest();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter word");

        String word = myObj.nextLine();  // Read user input
        System.out.println("word is: " + word);  // Output user input
        System.out.println("Reverse Word = " + obj.reverseString(word));

        System.out.println("word is: " + word);  // Output user input
        System.out.println("Reverse with Builder =- " + obj.reverseStringBuilder(word));


    }

}
