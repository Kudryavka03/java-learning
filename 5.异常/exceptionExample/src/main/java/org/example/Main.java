package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void throwsDemo() throws AbstractMethodError{
        throw new AbstractMethodError();
    }

    public static void main(String[] args) {
        //异常的一些使用方法,还是很好理解的
        try{
            int a = 6/0;
            System.out.println(a);  //可能会抛出异常的代码
        }

        catch(ArithmeticException e0){
            System.out.println(e0.toString());//这段会被执行
        }
        catch(Exception e){
            System.out.println("出现异常情况："+e.toString());//这段应该不会被执行
        }
        finally{
            System.out.println("Finally中的方法被执行");
            try {
                throwsDemo();
            }
            catch(AbstractMethodError e){
                System.out.println("出现异常情况："+e.toString());
            }
            finally{
                try{
                    throw new myExceptionClass(20);
                }
                catch(myExceptionClass e){
                    System.out.println(e.toString());
                }
            }
        }

        //接下来是手动抛出一个异常
        throw new RuntimeException("exceptionExample");
    }
}
class myExceptionClass extends Exception{
    int exceptionCode;
    myExceptionClass(int exceptionCode){
        this.exceptionCode =  exceptionCode;
    }
    public  String toString(){
        return "抛出了个自定义异常，代码"+exceptionCode;
    }
}
