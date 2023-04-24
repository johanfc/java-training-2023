package com.jfc.lambda;

public class Calculatrice {

    @FunctionalInterface
    interface OperationEntiere {
        long effectuer(int a, int b);
    }

    public long calculer(int a, int b, OperationEntiere operation) {
        return operation.effectuer(a, b);
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        OperationEntiere addition = (a, b) -> a + b;
        OperationEntiere soustraction = (a, b) -> a - b;

        System.out.println(calc.calculer(10, 5, addition));
        System.out.println(calc.calculer(10, 5, soustraction));
    }
}