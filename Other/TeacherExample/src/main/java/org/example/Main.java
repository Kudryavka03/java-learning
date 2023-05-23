package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //初始化Map
        Map<String, String> map = new HashMap<String, String>() {{
            put("Tom", "CoreJava");
            put("John", "Oracle");
            put("Susan", "Oracle");
            put("Jerry", "JDBC");
            put("Jim", "UNIX");
            put("Kevin", "JSP");
            put("Lucy", "JSP");
        }};
        map.put("Allen", "JDBC");                                                            //新增一个老师
        map.put("Lucy", "CoreJava");                                                         //将Lucy的任教科目变成CoreJava
        map.forEach((key, value) -> println("老师: " + key + ", 课程: " + value));            //打印Map的所有内容
        println("");                                                                         //新开一行
        map.entrySet().stream().filter(x -> "JSP".equals(x.getValue()))
                .forEach(x -> println("老师：" + x.getKey() + "，课程" + x.getValue()));       //过滤并打印所有教JSP的老师
        println("");                                                                         //新开一行给
        main2();                                                                             //调用普通方法
    }

    public static void main2() {                                                             //非Lambda表达式版本
        //初始化Map
        Map<String, String> map = new HashMap<String, String>() {{
            put("Tom", "CoreJava");
            put("John", "Oracle");
            put("Susan", "Oracle");
            put("Jerry", "JDBC");
            put("Jim", "UNIX");
            put("Kevin", "JSP");
            put("Lucy", "JSP");
        }};
        map.put("Allen", "JDBC");                                                               //新增一个老师
        map.put("Lucy", "CoreJava");                                                            //将Lucy的任教科目变成CoreJava
        Iterator iterator;                                                                      //为迭代器分配内存
        iterator = map.entrySet().iterator();                                                   //初始化迭代器
        while(iterator.hasNext()){                                                              //遍历迭代器输出
            Map.Entry entry = (Map.Entry) iterator.next();
            println("老师"+entry.getKey()+" 科目："+entry.getValue());                            //entry是迭代器
        }
        iterator = map.entrySet().iterator();                                                   //重用迭代器，防止浪费内存
        println("");                                                                            //新开一行
        while(iterator.hasNext()){                                                              //遍历迭代器
            Map.Entry entry = (Map.Entry) iterator.next();
            if(entry.getValue()=="JSP")                                                         //对于任教科目为JSP的老师，输出
                println("老师"+entry.getKey()+" 科目："+entry.getValue());
        }
    }

    public static void println(String message){
        System.out.println(message);                                                             //定义一个函数用来print的
    }
}