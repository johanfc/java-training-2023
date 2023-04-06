package com.jfc.coding.codility;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


class SolutionBinaryGap {

    private Map<Integer,String> listOfGaps = new HashMap<Integer,String>();

    public int solution(int N) {
        // Implement your solution here
        if(N > 0){
            init();
            String binaryString = Integer.toBinaryString(N);
            String binaryGaps = hasGap(binaryString);
            if( binaryGaps == null ){
                return 0;
            }else{
                return validateString(binaryGaps);
            }

            // System.out.println(binaryString+" binary of "+N);
        }
        return 0;

    }

    private String hasGap(String binaryString){

              int firstIndexOf1 = binaryString.indexOf("1");
        int lastIndexOf1 = binaryString.lastIndexOf("1");

        String posibleGap = binaryString.substring(firstIndexOf1,lastIndexOf1);

        if(posibleGap.indexOf("0")>=0){
            return posibleGap;
        }

        return null;
    }

    private int validateString(String binaryString){
        List<Integer> matchesList = new ArrayList<>();

        for(int i = 1; i<=listOfGaps.size();i++){
            if(binaryString.indexOf(listOfGaps.get(i))>=0){
                matchesList.add(i);
            }
        }
        return matchesList.size();
    }

    private void init(){
        String seed = "0";
        for(int i = 1;i<64;i++){
            listOfGaps.put(i,seed.repeat(i));
        }
    }

}
