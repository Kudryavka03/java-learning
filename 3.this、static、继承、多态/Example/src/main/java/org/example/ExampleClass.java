package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExampleClass {
    public String stuName = "";
    public String stuGrade = "";
    public ExampleClass(String stuName){
        this.stuName=stuName;//Here can tell you what "this" does.
    }
    /*
    public ExampleClass(){
        stuName="Zhangsan";
    }

     */

    public void printInfo() {
        if (stuName.equals("")) {
            System.out.println("Nothing here...");//No need to do this
        } else {
            System.out.println("Called after a new. The new args you type is :"+stuName);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Main Function Overload Example");
    }

    public static void exampleFuction()
    {
        System.out.println("You can call me at anywhere after import!");
    }
    protected void callbackFunction(){
        System.out.println("public class ExampleClass");
    }
    protected void callbackFunction3(){
        System.out.println("public class ExampleClass 2");
    }
    protected void call1(){
        callbackFunction();
    }
}

