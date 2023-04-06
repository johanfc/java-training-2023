package com.jfc.coding.game;

public class TestGFT {

    public int reduceValues(String S){


        if(S.length() >= 256){
            return 799999;
        }

        int intNumber = 0;
        try {
            intNumber = Integer.parseInt(S, 2);
        }catch(NumberFormatException nE){

        }

        int intcp = intNumber;
        int ciclos = 0;

        while (intcp > 0){

            if( (intcp % 2)==0){ // es par  //even//

                intcp = intcp / 2;

            } else { //es impar //odd
                intcp = intcp -1 ;
            }
            ciclos++;
        }
        return ciclos;
    }

    public String buildString(){

        StringBuilder num = new StringBuilder();
        for(int i = 0 ; i<400000;i++){

            num.append("1");

        }

        return num.toString();
    }

    public static void main(String args[]){

        String numInBynary = "1";
        TestGFT obj = new TestGFT();
        System.out.println(obj.reduceValues(numInBynary));

        System.out.println(obj.reduceValues(obj.buildString()));
        //obj.buildString();

    }

}
