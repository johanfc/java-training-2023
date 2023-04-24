package com.jfc.lambda;

import java.util.Arrays;
import java.util.List;

public class TestMethodeReference {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("melon", "abricot", "fraise", "cerise");
        afficher(fruits, (fmt, arg) -> String.format(fmt, arg));
        System.out.println("With Method Reference");
        afficher(fruits, String::format);
        sortArray();
    }

    public static void afficher(List<String> liste, MonFormateur formateur) {
        int i = 0;
        for (String element : liste) {
            i++;
            System.out.print(formateur.formater("%3d %s%n", i, element));
        }
    }

    public static void sortArray() {
        Integer[] valeurs = {10, 4, 2, 7, 5, 8, 1, 9, 3, 6};
        Arrays.sort(valeurs, TestMethodeReference::comparerEntierAscendant);
        System.out.println(Arrays.deepToString(valeurs));
    }

    public static int comparerEntierAscendant(int a, int b) {
        return a - b;
    }

@FunctionalInterface
interface MonFormateur {
    String formater(String format, Object... arguments);
}

}