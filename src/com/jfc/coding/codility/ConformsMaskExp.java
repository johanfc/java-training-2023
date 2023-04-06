// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class ConformsMaskOpt {

    private List<String> binaryNumbers;
    private int max_lenght = 30;

    public int solution(int A, int B, int C) {
        // Implement your solution here
        initSolution(A,B,C);
        fillZeroToLeft();

        return calculateConforms();
    }

    private void initSolution(int A, int B, int C){
        binaryNumbers =  new ArrayList();
        binaryNumbers.add(String.valueOf(Integer.toBinaryString(A)));
        binaryNumbers.add(String.valueOf(Integer.toBinaryString(B)));
        binaryNumbers.add(String.valueOf(Integer.toBinaryString(C)));

    }

    private void fillZeroToLeft(){

        for(int i = 0;i< binaryNumbers.size();i++){

            String currentValue = binaryNumbers.get(i);
            String copytoLeft = "0".repeat(this.max_lenght-currentValue.length());

            binaryNumbers.set(i,copytoLeft+currentValue);
        }

    }

    private int calculateConforms(){

        int totalConforms = 0;

        int maxNumberOfCeros = 0;
        for(int i = 0;i< binaryNumbers.size();i++){
            int numberOfCero=0;
            for(int j=0;j<binaryNumbers.get(i).length();j++){

                if(binaryNumbers.get(i).charAt(j) == '0'){
                    numberOfCero++;
                }
            }
            if(numberOfCero>maxNumberOfCeros){
                maxNumberOfCeros = numberOfCero;
            }

        }
        double max = (double) maxNumberOfCeros;
        int response = 0;

        response = (int) Math.pow(2,max);

        return response;
    }
}