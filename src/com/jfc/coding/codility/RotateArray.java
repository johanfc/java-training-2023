package com.jfc.coding.codility;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class RotateArray {

    private LinkedList linkedList = new LinkedList();

    public int[] solution(int[] A, int K) {
        // Implement your solution here

        for(int i=0 ; i<K ;i++){
            rotate(A);
        }

        return A;
    }

    private int[] rotate(int [] A){

        int size = A.length;

        for(int i=size-1;i>=1;i--){
            int lastElement = A[i];
            A[i]=A[i-1];
            A[i-1]=lastElement;
        }

        return A;
    }

}