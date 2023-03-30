package test;

import java.util.Scanner;



public class test {
	public static void main(String[] args){
		for(;;){
			System.out.println("请选择你的入口：\n1.一次性编辑并查看学生信息\n2.一次性编辑并查看教师信息");
			Scanner scanner = new Scanner(System.in);
			int fuctionType = scanner.nextInt();
			if (fuctionType==1) placeholderfx1();
			if (fuctionType==2) placeholderfx2();
		}
	}
	public static void placeholderfx1(){
		int endSignal = 0;
		for(;endSignal == 0;){
			Stu stu = new Stu();
			stu.set_stuName(inputString("请输入学生姓名"));
	//		stu.get_stuName();
			stu.setScore(inputInt("请输入学生成绩"));
	//		stu.getScore();
			stu.setAge(inputInt("请输入学生年龄"));
	//		stu.getAge();
			endSignal = stu.printInfo();
		}
	}
	public static void placeholderfx2(){
		int endSignal = 0;
		for(;endSignal != 1;){
			Teacher tch = new Teacher();
			tch.setAge(inputInt("请输入老师年龄"));
			tch.set_tchAge(inputInt("请输入老师教龄"));
			tch.set_tchSubject(inputString("请输入老师科目"));
			tch.setSex(inputInt("请输入老师性别（0为男，1为女）"));
			tch.set_tchName(inputString("请输入老师名称"));
			endSignal = tch.printInfo();//打印信息同时获取循环终止信号以跳出循环
		}
	}
	public static String inputString(String tipsText){
		Scanner scanner = new Scanner(System.in);
		System.out.println(tipsText);
		return scanner.nextLine();
	}
	public static int inputInt(String tipsText){
		Scanner scanner = new Scanner(System.in);
		System.out.println(tipsText);
		return scanner.nextInt();
	}
}
