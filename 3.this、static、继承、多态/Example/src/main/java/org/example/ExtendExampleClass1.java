package org.example;

public class ExtendExampleClass1 extends ExampleClass {
    String stuAddr;
    public ExtendExampleClass1(String stuAddr,String stuName,String stuGrade)
    {
        super(stuName);//I must init ParentClass,so parent class can work well.
        //if you doesn't want to do this you can creat a no-args constructor on parent class.
        //this.stuName = stuName;  stuName from ExampleClass,it equals to super("Zhangsan");
        this.stuGrade = stuGrade;
        this.stuAddr = stuAddr;
    }
    public void printInfo(){//Override
        System.out.println("Student Name is "+stuName+",address is "+stuAddr+",Grade is "+stuGrade);
    }
    protected void callbackFunction(){
        System.out.println("public class ExtendExampleClass1 extends ExampleClass");
    }
}
