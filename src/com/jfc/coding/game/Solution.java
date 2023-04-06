package com.jfc.coding.game;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int minValue = 1;
        Arrays.sort(A);
        //Pasar A to List
        List<Integer> intList = new ArrayList<Integer>(A.length);
        for (int i : A)
        {
            intList.add(i);
        }
        //si la lista no contiene 1 retornar 1
        if(!intList.contains(minValue)) {
            return minValue;
        }
        //si contiene uno, por medio de un stream con un comparator identificar donde hay salto
        // esdecir, item1-item2 abs > 1
        //ArrayList<Integer> minimumVals =  intList.stream()
        //       .reduce(1,(item1,item2)-> ( item1.intValue() - item2.intValue() )>1 ? 0 : 999999 );


        int nextToLast = 0;
        for(int i = 0;i<A.length-1;i++){

            int minVal = intList.get(i);
            int nexVal = intList.get(i+1);

            if(nexVal - minVal > 1) {
                return minVal+1;
            }else{
                nextToLast = nexVal + 1;
            }
        }

        return nextToLast;

    }

    public static void main(String args[]){

        Solution obj = new Solution();
        int[] ints = {1,2,3,4,5};
        System.out.println(obj.solution(ints));

    }
}
