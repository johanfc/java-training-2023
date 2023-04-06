package com.jfc.coding.game;

import java.util.*;
import java.io.*;
import java.math.*;

class TestArrayJava {

    public static int computeCheckDigit(String identificationNumber) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        //sommez les chiffres paires
        char[] idChar = identificationNumber.toCharArray();

        int sumPair = 0;
        int sumImpar = 0;

        for( int i = 0;i< idChar.length;i++){

            if( (i % 2)==0){
                sumPair = sumPair + Integer.parseInt(String.valueOf(idChar[i]));
            } else {
                sumImpar = sumImpar + Integer.parseInt(String.valueOf(idChar[i]));
            }


        }

        sumPair = sumPair*3;
        sumPair = sumPair  +  sumImpar;

        String cle = String.valueOf(sumPair);

        //System.out.println("cle "+cle);

        char dernierCh = cle.charAt(cle.length()-1);

        //System.out.println("Dernier"+dernierCh);

        int resp = 10-Integer.parseInt(String.valueOf(dernierCh));

        return resp ;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String identificationNumber = in.next();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int checkDigit = computeCheckDigit(identificationNumber);
        System.setOut(outStream);
        System.out.println(checkDigit);
    }
    // #endregion
}