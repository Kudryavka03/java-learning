package org.example;

import java.util.Objects;

import static java.lang.System.out;
import static org.example.ExampleClass.exampleFuction;

public class Main {
    public static final int verNumber = 1;//Final意思是只能用一次
    public static void main(String[] args) {
        System.out.println("Static Method doesn't need new.");
        exampleFuction();
        ExampleClass exampleFx = new ExampleClass("Lihua");
        exampleFx.printInfo();
        ExampleClass exampleFx1 = new ExtendExampleClass1("Guangdong","Wangwu","9");//Auto Convert
        ExampleClass exampleFx2 = new ExtendExampleClass2("Zhaoliu");
        ExtendExampleClass2 exampleFx3 = (ExtendExampleClass2) exampleFx2; ///Forced conversion
        exampleFx3.printInfo();
        exampleFx1.printInfo();
        exampleFx2.printInfo();
        System.out.println("exampleFx1 "+(exampleFx1 instanceof ExampleClass?"is":"is not")+" instance of ExampleClass");
    }
}
