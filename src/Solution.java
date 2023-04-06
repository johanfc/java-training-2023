import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static String translate(String text) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        //String parasite = "av";

        //StringBuilder strb = new StringBuilder(text);

        System.out.println(text);

        //strb.replace(1, 3, parasite);


       // return strb.toString();
        return text;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        String javanais = translate(text);
        System.setOut(outStream);
        System.out.println(javanais);
    }
    // #endregion
}
