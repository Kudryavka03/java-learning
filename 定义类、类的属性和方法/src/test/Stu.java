package test;

public class Stu{
	private static String stuName;//管他私有还是公有，能用就行（）
	private static int age=0,score=0;
	public static int getScore(){
		return score;
	}
	public static int getAge(){
		return age;
	}
	public static String get_stuName(){
		return stuName;
	}
	public static void setScore(int scorein){
		score=scorein;
		System.out.println("学生成绩被设置为："+score);
	}
	public static void setAge(int ageIn){
		age=ageIn;
		System.out.println("学生年林被设置为："+age);
	}
	public static void set_stuName(String name){
		stuName =name;
		System.out.println("学生姓名被设置为："+name);
	}
	public int printInfo(){
		if(stuName==""  || age <1){
			System.out.println("学生档案不完整或年龄不对劲，请尝试补全后再打印");
			return 0;
		}
		else{
			System.out.println("学生姓名："+stuName);
			System.out.println("学生年龄："+age);
			System.out.println("学生成绩："+score);
			return 1;
		}
	}
}