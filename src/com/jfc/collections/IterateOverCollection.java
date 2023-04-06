package com.jfc.collections;

import java.util.*;

public class IterateOverCollection {

    public void testLoops() {
        String array[] = {"Ron", "Harry", "Hermoine"};
        String var = "";
        var.charAt(3);
        System.out.println("Testing Loop");
        // enhanced for loop
        for (String x : array) {
            System.out.println(x);
        }
    }

    public void testArrayList(){
        ArrayList<String> list= new ArrayList<>(Arrays.asList("Pedro","Pablo","Juan"));

//Traversing list through Iterator
        System.out.println("Testing ArrayList and Iterator");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // normal loop
        for (String l : list) {
            System.out.println(l);
        }

        // method reference
        list.forEach(System.out::println);

        // filter null value
        list.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);




    }

    public static void loopMapClassic() {
        Map<String, Integer> map = Map.of("A", 10,"B",null,"B1", 20,"C", 30,"D", 40,"E", 50,"F", 60);

        //normal loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }

        // lambda
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        // ensure map is not null
        if (map != null) {
            map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        }

        map.forEach(
                (k, v) -> {
                    // yes, we can put logic here
                    if (k != null){
                        System.out.println("Key : " + k + ", Value : " + v);
                    }
                }
        );



    }

    public static void main(String args[]){

        IterateOverCollection obj = new IterateOverCollection();
        System.out.println("Loop Example");
        obj.testLoops();
        System.out.println("Loop Example");
        obj.testArrayList();
        String gty = "ffhfhj";
        gty.indexOf("000");
        Map<Integer,String> listOfGaps = new HashMap<Integer,String>();

        listOfGaps.put(1,"0");
        listOfGaps.put(2,"00");
        listOfGaps.put(3,"000");
        listOfGaps.put(4,"0000");
        listOfGaps.put(5,"00000");
        listOfGaps.put(6,"000000");

        System.out.println("listOfGaps.size--->"+listOfGaps.size());

        System.out.println(listOfGaps.get(6));

    }

}
