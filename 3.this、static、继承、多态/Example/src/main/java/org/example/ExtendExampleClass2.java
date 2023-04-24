package org.example;

import org.example.ExampleClass;

public class ExtendExampleClass2 extends ExampleClass {
    public ExtendExampleClass2(String stuName)
    {
        super(stuName);//initial
    }
    public void printInfo(){//Override
        System.out.println("Hey，"+stuName+"，This echo is from ExtendExampleClass2！");
    }

    protected void callbackFunction(){
        System.out.println("public class ExtendExampleClass2 extends ExampleClass");
    }
    protected void callbackFunction2(){
        System.out.println("public class ExtendExampleClass2 extends ExampleClass 2");
    }

    protected void call1(){
        callbackFunction2();
    }
}