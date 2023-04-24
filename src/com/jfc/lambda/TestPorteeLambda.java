package com.jfc.lambda;

import java.awt.event.ActionListener;

public class TestPorteeLambda {

    public static void main(String[] args) {
        TestPorteeLambda instance = new TestPorteeLambda();
        System.out.println(instance.toString());
        instance.executer();
        new Thread(TestPorteeLambda::executerStatic).start();
    }

    public void executer() {
        Runnable runnable = () -> { System.out.println("Execute Lambda "+this.toString());};
        Thread thread = new Thread(runnable);
        thread.start();
    }

    static void executerStatic() {
        System.out.println("Mon traitement static par "+Thread.currentThread().getName());
    }

}