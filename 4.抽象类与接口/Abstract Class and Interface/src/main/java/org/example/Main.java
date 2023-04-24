package org.example;
interface interfaceExample{
    String color = "yellow";
    String getColor2();
    //double runTimer(double a,double b,double c);
}
abstract class abstractExample implements interfaceExample{
    String color;
    public abstractExample(String color) {
        this.color = "green";
    }
    public  String testFunction1() {
        return  "green";
    }
    abstractExample() {
        color=(color == null)?"red":color;
    }
    public abstract void printInfo();
    protected void printInfo2(){
        callbackFunction();
    }
    private void callbackFunction(){
        System.out.println("abstract class abstractExample implements interfaceExample");
    }
}

class abstractExampleClass extends abstractExample{
    public abstractExampleClass(String color){
        this.color=color;
    }
    public void printInfo() {
        System.out.println("This Function calls from abstractExampleClass extends abstractExample");
        System.out.println("Args of color is:"+color);
        System.out.println(getColor2());
    }
    public String getColor2(){
        return interfaceExample.color;
        //return color;
    }
    public  String testFunction1() {
        return  "yellow";
    }
    protected void printInfo2(){
        callbackFunction();
    }
    private void callbackFunction(){
        System.out.println("class abstractExampleClass extends abstractExample");
    }
}

public class Main {
    public static void main(String[] args) {
        abstractExampleClass example = new abstractExampleClass("black");
       example.printInfo();
       abstractExample example1 = new abstractExampleClass("pink");
       example1.printInfo();
       ///////////////////////
       example.printInfo2();
       example1.printInfo2();
       //int a(int z,int x,int c);

    }
}