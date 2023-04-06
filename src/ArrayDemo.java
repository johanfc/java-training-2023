import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDemo {



    public static void main(String[] args) {
        String s = "*";
        String longString = s.repeat(6);
        System.out.println(longString);
        System.out.println(String.format("id = %08.2f",423.147));//test

        final Set<String> set = new HashSet<>(
                Arrays.asList("first","second"));

        set.add("uno");

        // initializing unsorted int array
        int iArr[] = { 20,22,50 ,30};

        // sorting array
        Arrays.sort(iArr);

        int min = iArr[0];

        int max = iArr[iArr.length-1];

        int current = 0;
        int previous = 0;

        for (int i = 0 ; i < iArr.length; i++) {
          current = iArr[i];
          if(i>0)
          previous = iArr[i-1];

          int posible = (Math.abs(current)-Math.abs(previous));
          if(posible >1 && previous > 0){
              int resp = previous+1;
              System.out.println("min "+resp);
              break;
          }

        }
    }
}