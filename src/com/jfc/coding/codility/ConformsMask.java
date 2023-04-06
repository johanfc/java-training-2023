package com.jfc.coding.codility;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
/*SOLUTION PAR BRUTE FORCE*/
class ConformsMask {

    private List<Integer> listOfConforms = new ArrayList<>();

    private List<Integer> finalListOfConforms = new ArrayList<>();

    private final int CONST_MAX_VALUE = 1073741823;

    public int solution(int A, int B, int C) {
        // Implement your solution here

        addConformsForInt(A);
        addConformsForInt(B);
        addConformsForInt(C);

//remover duplicados
        removeDuplicates();

        return finalListOfConforms.size();

    }

    public void addConformsForInt(int number){
        if(number>0) {
            String binaryNumber = Integer.toBinaryString(number);
            listOfConforms.add(number);
            System.out.println("number=" + number);
            for (int nextNumber = number + 1; nextNumber <= this.CONST_MAX_VALUE; nextNumber++) {

                String binaryNextNumber = Integer.toBinaryString(nextNumber);
                boolean isCorrespond = true;
//                for (int position = 0; position < binaryNumber.length(); position++) {
//                    if (binaryNumber.charAt(position) == '1'
//                            && binaryNextNumber.charAt(position) != '1') {
//                        isCorrespond = false;
//                        break;
//                    }
//                }
//
//                if (isCorrespond) {
//                    listOfConforms.add(nextNumber);
//                }

            }

        }
    }

    private void removeDuplicates(){

        listOfConforms.stream().distinct().forEach(finalListOfConforms::add);
    }

    public static void main(String args[]){

        ConformsMask obj = new ConformsMask();
        System.out.println("solution"+obj.solution(0,1,2));

    }

}
