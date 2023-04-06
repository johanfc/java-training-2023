package com.jfc.strings;

import java.lang.invoke.StringConcatFactory;

public class StringConcatBadPerformance {

    public static String concat(String first, String second){
        return first+=second;
    }

    public static void main(String args[]){
        System.out.println(concat("Bad","Performance"));
        StringConcatFactory afc;
    }

}
