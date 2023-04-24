package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface Common{
    String type_name();
    double calcVolume(double a,double b,double c);
}

class cuboidVolume implements Common{
    public String type_name(){
        return"长方体";
    }
    public double calcVolume(double Long,double weight,double height) {
        return Long*weight*height;
    }
}

class cubeVolume implements Common{

    public String type_name(){
        return"正方体";
    }
    public double calcVolume(double Long,double weight,double height) {
        return Long*weight*height;
    }
    public double calcVolume(double weight) {
        return calcVolume(weight,weight,weight);
    }
}

//此时我希望加一个关于圆的体积计算
class circleVolume implements Common{

    final double PI = 3.1415926f;
    public String type_name(){
        return"球体";
    }
    public double calcVolume(double PI,double r,double r2) {
        return PI*r*r;
    }
    public double calcVolume(double r) {
        return calcVolume(PI,r,r);
    }
}

public class Main {
    public static void main(String[] args) {
        var t = new cuboidVolume();
        System.out.println(t.type_name()+"的体积是"+t.calcVolume(2,3,4));
        var t0 = new cubeVolume();
        System.out.println(t0.type_name()+"的体积是"+t0.calcVolume(4));
        //此时我希望加一个关于圆的体积计算
        var t1 = new circleVolume();
        System.out.println(t1.type_name()+"的体积是"+t0.calcVolume(3));
    }
}