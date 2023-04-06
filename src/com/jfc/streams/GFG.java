package com.jfc.streams;

// Java code to show use of double colon operator
// for static methods

import java.util.*;

class GFG {

    // static function to be called
    static void someFunction(String s)
    {
        System.out.println(s);
    }

    public void processListIfEmpty(List<String> lista) {

        String cookie = null;
        try {
            cookie = lista.stream()
                    .filter(c -> "AA".equals("AA"))
                    .findFirst().orElseThrow(Exception::new);
            //si no hay error
            System.out.println("it is okokokok");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void equals(){

        String [] mpp = new String[3];

        String valeur = "bbb";

        mpp[0] = "aaaa";
        //mpp[1] = null;
        mpp[2] = "bbb";

        if(valeur.equalsIgnoreCase(mpp[1])){
            System.out.println("Correct validation de mpp");
        }else{
            System.out.println("Nulllllll validation OK");
        }


    }

    public static void main(String[] args)
    {

        GFG obj = new GFG();
        //obj.equals();
        List<String> list = new ArrayList<String>();
        //list.add("Geeks");
        //list.add("AAA");
        //list.add("GEEKS");
        obj.processListIfEmpty(list);
        // call the static method
        // using double colon operator
       // list.forEach(GFG::someFunction);
    }
}

