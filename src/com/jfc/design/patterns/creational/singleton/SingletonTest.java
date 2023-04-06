package com.jfc.design.patterns.creational.singleton;// Java program implementing Singleton class
// with method name as that of class

// Class 1
// Helper class
class SingletonTest {
    // Static variable single_instance of type Singleton
    private static SingletonTest single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor of this class
    // Here private constructor is is used to
    // restricted to this class itself
    private SingletonTest()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // Method
    // Static method to create instance of Singleton class
    public static SingletonTest Singleton()
    {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new SingletonTest();
        }
        return single_instance;
    }
}

// Class 2
// Main class
class GFG {
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        SingletonTest x = SingletonTest.Singleton();

        // Instantiating Singleton class with variable y
        SingletonTest y = SingletonTest.Singleton();

        // instantiating Singleton class with variable z
        SingletonTest z = SingletonTest.Singleton();

        // Now changing variable of instance x
        // via toUpperCase() method
        x.s = (x.s).toUpperCase();

        // Print and display commands
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // Now again changing variable of instance x
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
