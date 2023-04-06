package com.jfc.object.programming;// Java Program to Illustrate That an Iinstance of Abstract
// Class Can not be created

// Class 1
// Abstract class
abstract class Base {
    abstract void fun();
}

// Class 2
class Derived extends Base {

    private String msg=null;
    private String param = null;

    public Derived(){
        msg = new String("Inicio");
        param = new String ("myParam");
    }

    void fun()
    {
        System.out.println("Derived fun() called by using base class");
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}

// Class 3
// Main class
class Main {

    public void methodA(){
        Derived respObj = methodB();
        System.out.println(respObj.getParam());
    }
    public Derived methodB(){
        Derived objDerived = new Derived();
        methodC(objDerived);
        return objDerived;
    }
    public void methodC(Derived objDerived){
        objDerived.setParam("modifie par method C");
    }

    // Main driver method
    public static void main(String args[])
    {
        Main main = new Main();
        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();
        main.methodA();
        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}
