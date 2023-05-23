package org.example;

public class Student implements Comparable<Student> {
    String name;
    int age;
    double score;
    String classNum;

    public Student(String name, int age, double score, String classNum) {
        this.age = age;
        this.name = name;
        this.score = score;
        this.classNum = classNum;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getScore(){
        return score;

    }
    public String getClassName(){
        return classNum;
    }

    @Override
    public int compareTo(Student o1){
        return this.getClassName().compareTo(o1.getClassName());
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        if(this == obj){
            return true;
        }
        Student student = (Student) obj;
        return (this.classNum.equals(student.getClassName()));
    }
}
